package com.elderdrivers.riru.edxp.yahfa.config;

import com.elderdrivers.riru.edxp.Main;
import com.elderdrivers.riru.edxp.config.EdXpConfig;
import com.elderdrivers.riru.edxp.config.InstallerChooser;
import com.elderdrivers.riru.edxp.hooker.XposedBlackListHooker;

public class YahfaEdxpConfig implements EdXpConfig {
    @Override
    public String getInstallerBaseDir() {
        return InstallerChooser.INSTALLER_DATA_BASE_DIR;
    }

    @Override
    public String getBlackListModulePackageName() {
        return XposedBlackListHooker.BLACK_LIST_PACKAGE_NAME;
    }

    @Override
    public boolean isDynamicModulesMode() {
        return Main.isDynamicModulesEnabled();
    }

    @Override
    public boolean isResourcesHookEnabled() {
        return Main.isResourcesHookEnabled();
    }
}
