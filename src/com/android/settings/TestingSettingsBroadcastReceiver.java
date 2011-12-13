package com.android.settings;

import android.provider.Telephony;
import static android.provider.Telephony.Intents.SECRET_CODE_ACTION;

import android.content.Context;
import android.content.Intent;
import android.content.BroadcastReceiver;
import android.util.Config;
import android.util.Log;
import android.view.KeyEvent;


public class TestingSettingsBroadcastReceiver extends BroadcastReceiver {
  
    public TestingSettingsBroadcastReceiver() {
    }
    
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(SECRET_CODE_ACTION)) {
        	if(intent.getData()==null)
        		return;
        	String host=intent.getData().getHost();
        	Intent i = new Intent(Intent.ACTION_MAIN);
        	if("4636".equals(host)){
	            i.setClass(context, TestingSettings.class);
	            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
	            context.startActivity(i);
        	}else if("2846579".equals(host)){
        		i.setClass(context, TestingSettingsHW.class);
        		i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
	            context.startActivity(i);
        	}
        }
    }
}
