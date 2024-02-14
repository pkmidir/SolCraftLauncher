package soldev.solcraftlauncher.prefs.screens;

import android.os.Bundle;

import androidx.preference.Preference;

import soldev.solcraftlauncher.R;
import soldev.solcraftlauncher.Tools;

public class LauncherPreferenceMiscellaneousFragment extends LauncherPreferenceFragment {
    @Override
    public void onCreatePreferences(Bundle b, String str) {
        addPreferencesFromResource(R.xml.pref_misc);
        Preference driverPreference = requirePreference("zinkPreferSystemDriver");
        if(!Tools.checkVulkanSupport(driverPreference.getContext().getPackageManager())) {
            driverPreference.setVisible(false);
        }
    }
}
