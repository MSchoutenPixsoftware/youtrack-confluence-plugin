package jetbrains.youtrack.settings;

import com.atlassian.plugin.spring.scanner.annotation.imports.ComponentImport;
import com.atlassian.sal.api.ApplicationProperties;
import com.atlassian.sal.api.auth.LoginUriProvider;
import com.atlassian.sal.api.pluginsettings.PluginSettings;
import com.atlassian.sal.api.pluginsettings.PluginSettingsFactory;
import com.atlassian.sal.api.transaction.TransactionTemplate;
import com.atlassian.sal.api.user.UserManager;
import com.atlassian.templaterenderer.TemplateRenderer;
import jetbrains.youtrack.Strings;
import jetbrains.youtrack.client.YouTrackClient;
import jetbrains.youtrack.client.YouTrackClientFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static jetbrains.youtrack.Strings.*;

@Named("ConfigurationServlet")
public class ConfigurationServlet extends HttpServlet {

    private static final Logger LOG = LoggerFactory.getLogger(ConfigurationServlet.class);
    private final UserManager userManager;
    private final LoginUriProvider loginUriProvider;
    private final TemplateRenderer renderer;
    private final ApplicationProperties applicationProperties;
    private final PluginSettingsFactory pluginSettingsFactory;
    private final TransactionTemplate transactionTemplate;
    private int justSaved = -1;

    @Inject
    public ConfigurationServlet(@ComponentImport UserManager userManager,
                                @ComponentImport LoginUriProvider loginUriProvider,
                                @ComponentImport TemplateRenderer renderer,
                                @ComponentImport ApplicationProperties applicationProperties,
                                @ComponentImport PluginSettingsFactory pluginSettingsFactory,
                                @ComponentImport TransactionTemplate transactionTemplate) {

        this.userManager = userManager;
        this.loginUriProvider = loginUriProvider;
        this.renderer = renderer;
        this.applicationProperties = applicationProperties;
        this.pluginSettingsFactory = pluginSettingsFactory;
        this.transactionTemplate = transactionTemplate;
    }

    private void checkAdminRights(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        final String username = userManager.getRemoteUsername(req);
        if (username == null || !userManager.isAdmin(username)) {
            redirectToLogin(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        checkAdminRights(req, resp);
        final String token = req.getParameter(AUTH_KEY);

        String baseURL = req.getParameter(LINKBASE);
        if (baseURL == null || baseURL.isEmpty()) {
            resp.setStatus(400);
            return;
        }

        final String hostAddressPassed = req.getParameter(HOST);
        final String hostAddress = Strings.fixURL((hostAddressPassed == null || hostAddressPassed.isEmpty()) ? baseURL : hostAddressPassed);

        final String trustAll = req.getParameter(TRUST_ALL) != null ? "true" : "false";
        final String extendedDebug = req.getParameter(EXTENDED_DEBUG) != null ? "true" : "false";
        try {
            final YouTrackClient client = YouTrackClientFactory.newClient(hostAddress, token, Boolean.parseBoolean(trustAll));
            if (!client.isValid()) {
                resp.setStatus(400);
                return;
            }
            final String finalLinkbase = baseURL;
            YouTrackClientService.useClient(client);
            transactionTemplate.execute(() -> {
                final PluginSettings pluginSettings = pluginSettingsFactory.createGlobalSettings();
                final Properties storage = new Properties();
                storage.setProperty(HOST, hostAddress);
                storage.setProperty(EXTENDED_DEBUG, extendedDebug);
                storage.setProperty(AUTH_KEY, token);
                storage.setProperty(TRUST_ALL, trustAll);
                storage.setProperty(LINKBASE, finalLinkbase);
                pluginSettings.put(MAIN_KEY, storage);
                return storage;
            });
            justSaved = 0;
        } catch (Exception e) {
            LOG.error("YouTrack integration login failed.", e);
            e.printStackTrace();
            justSaved = -2;
        }
        doGet(req, resp);
    }

    private String intValueOf(String retries, int defaultValue) {
        try {
            Integer i = Integer.parseInt(retries);
            return String.valueOf(i);
        } catch (NumberFormatException nfe) {
            return String.valueOf(defaultValue);
        }
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        checkAdminRights(request, response);
        final Map<String, Object> params = new HashMap<>();
        params.put("baseUrl", applicationProperties.getBaseUrl());
        Properties storage = transactionTemplate.execute(() -> {
            final PluginSettings pluginSettings = pluginSettingsFactory.createGlobalSettings();
            return (Properties) pluginSettings.get(MAIN_KEY);
        });

        if (storage == null) storage = new Properties();

        params.put(HOST, storage.getProperty(HOST, EMPTY));
        params.put(AUTH_KEY, storage.getProperty(AUTH_KEY, EMPTY));
        params.put(EXTENDED_DEBUG, storage.getProperty(EXTENDED_DEBUG, "false"));
        params.put(TRUST_ALL, storage.getProperty(TRUST_ALL, "false"));
        params.put(LINKBASE, storage.getProperty(LINKBASE, EMPTY));

        params.put("justSaved", justSaved);
        justSaved = -1;
        response.setContentType("text/html;charset=utf-8");
        renderer.render("/templates/settings-servlet.vm", params, response.getWriter());
    }

    private void redirectToLogin(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect(loginUriProvider.getLoginUri(getUri(request)).toASCIIString());
    }

    private URI getUri(HttpServletRequest request) {
        final StringBuffer builder = request.getRequestURL();
        if (request.getQueryString() != null) {
            builder.append("?");
            builder.append(request.getQueryString());
        }
        return URI.create(builder.toString());
    }
}