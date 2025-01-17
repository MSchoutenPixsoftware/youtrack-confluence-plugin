package jetbrains.youtrack.macros;

import com.atlassian.confluence.macro.Macro;
import com.atlassian.sal.api.pluginsettings.PluginSettings;
import com.atlassian.sal.api.pluginsettings.PluginSettingsFactory;
import com.atlassian.sal.api.transaction.TransactionCallback;
import com.atlassian.sal.api.transaction.TransactionTemplate;
import jetbrains.youtrack.Strings;

import java.util.Properties;

public abstract class MacroWithPersistableSettingsBase implements Macro {

    private final PluginSettingsFactory pluginSettingsFactory;

    private final TransactionTemplate transactionTemplate;

    private Properties storage;

    public MacroWithPersistableSettingsBase(PluginSettingsFactory pluginSettingsFactory,
                                            TransactionTemplate transactionTemplate) {
        this.pluginSettingsFactory = pluginSettingsFactory;
        this.transactionTemplate = transactionTemplate;
        load();
    }

    private void persist() {
        transactionTemplate.execute((TransactionCallback<Properties>) () -> {
            final PluginSettings pluginSettings = pluginSettingsFactory.createGlobalSettings();
            pluginSettings.put(Strings.MAIN_KEY, storage);
            return null;
        });
    }

    private void load() {
        storage = transactionTemplate.execute(() -> {
            final PluginSettings pluginSettings = pluginSettingsFactory.createGlobalSettings();
            final Object o = pluginSettings.get(Strings.MAIN_KEY);
            return o instanceof Properties ? (Properties) o : null;
        });
        if (storage == null) storage = new Properties();
    }


    protected String getProperty(final String key) {
        load();
        return storage.getProperty(key, Strings.EMPTY);
    }

    protected String getProperty(final String key, String defaultValue) {
        load();
        return storage.getProperty(key, defaultValue);
    }

    void setProperty(final String key, final String value) {
        storage.setProperty(key, value);
        persist();
    }
}