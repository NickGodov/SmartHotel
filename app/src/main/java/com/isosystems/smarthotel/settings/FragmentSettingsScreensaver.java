package com.isosystems.smarthotel.settings;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import com.isosystems.smarthotel.R;

public class FragmentSettingsScreensaver extends PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.settings_screensaver);
    }
}
