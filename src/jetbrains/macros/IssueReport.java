package jetbrains.macros;

import com.atlassian.bandana.BandanaManager;
import com.atlassian.confluence.renderer.radeox.macros.MacroUtils;
import com.atlassian.confluence.util.velocity.VelocityUtils;
import com.atlassian.renderer.RenderContext;
import com.atlassian.renderer.v2.RenderMode;
import com.atlassian.renderer.v2.macro.MacroException;
import com.sun.istack.internal.Nullable;
import jetbrains.macros.base.YouTrackAuthAwareMacroBase;
import youtrack.Issue;
import youtrack.Project;
import youtrack.exceptions.AuthenticationErrorException;
import youtrack.exceptions.CommandExecutionException;
import youtrack.exceptions.NoSuchIssueFieldException;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IssueReport extends YouTrackAuthAwareMacroBase {
    private static final String BODY = "templates/body-report.vm";
    private static final String ROW = "templates/body-report-row.vm";

    public IssueReport(BandanaManager bandanaManager) throws IOException, AuthenticationErrorException, NoSuchIssueFieldException, CommandExecutionException {
        super(bandanaManager);
    }

    public boolean isInline() {
        return false;
    }

    public boolean hasBody() {
        return false;
    }

    public RenderMode getBodyRenderMode() {
        return RenderMode.NO_RENDER;
    }

    @Nullable
    private Project tryGetProject(String id) throws CommandExecutionException, IOException, NoSuchIssueFieldException, AuthenticationErrorException {
        Project result;
        try {
            result = youTrack.projects.item(id);
        } catch (Exception e) {
            result = null;
        }
        if (result == null) {
            youTrack.login(userName, password);
            result = youTrack.projects.item(id);
            if (result != null) {
                storeCurrentAuth();
            }
        }
        return result;
    }

    public String execute(Map params, String body, RenderContext renderContext)
            throws MacroException {
        try {
            final Map<String, Object> context = MacroUtils.defaultVelocityContext();
            final String project = (String) params.get("project");
            final String query = (String) params.get("query");
            final StringBuilder result = new StringBuilder();
            final StringBuilder rows = new StringBuilder();
            if (project != null && query != null) {
                final Project prj = tryGetProject(project);
                final Map<String, Object> myContext = new HashMap<String, Object>();
                final List<Issue> issues = prj.issues.query(query);
                for (Issue sIssue : issues) {
                    myContext.clear();
                    myContext.putAll(context);
                    Issue issue = sIssue.createSnapshot();
                    myContext.put("issue", sIssue.getId());
                    myContext.put("base", baseHost.replace("/rest/", ""));
                    myContext.put("state", issue.getState());
                    myContext.put("summary", issue.getSummary());
                    myContext.put("assignee", issue.getAssignee().getFullName());
                    rows.append(VelocityUtils.getRenderedTemplate(ROW, myContext));
                }

                String s = "<p>{0}</p>\n" +
                        "<table>\n" +
                        "    <tr>\n" +
                        "        <th>Issue</th>\n" +
                        "        <th>State</th>\n" +
                        "        <th>Summary</th>\n" +
                        "        <th>Assignee</th>\n" +
                        "    </tr>\n" +
                        "{1}\n" +
                        "</table>";


                result.append(MessageFormat.format(s, query + " from " + project, rows.toString()));
            }
            return result.toString();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new MacroException(ex);
        }
    }
}