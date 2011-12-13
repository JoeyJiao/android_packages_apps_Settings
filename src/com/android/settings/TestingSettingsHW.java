package com.android.settings;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceGroup;

public class TestingSettingsHW extends PreferenceActivity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.testing_settings_hw);
		PreferenceGroup pg=(PreferenceGroup) findPreference("parent");
		boolean b1=Utils.updatePreferenceToSpecificActivityOrRemove(this, pg, "mmi_test", 0);
		boolean b2=Utils.updatePreferenceToSpecificActivityOrRemove(this, pg, "project_menu", 0);
	}

}
