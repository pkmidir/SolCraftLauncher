package soldev.solcraftlauncher.prefs.screens;

import android.os.Bundle;

import soldev.solcraftlauncher.R;

public class LauncherPreferenceExperimentalFragment extends LauncherPreferenceFragment {

    @Override
    public void onCreatePreferences(Bundle b, String str) {
        addPreferencesFromResource(R.xml.pref_experimental);
    }
}
