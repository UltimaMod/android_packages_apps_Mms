package com.android.mms.util;

import com.android.mms.R;

import android.content.Context;
import android.content.SharedPreferences;

public class Preferences implements Constants{
	
	private static Context mContext = CONTEXT;
	
    private Preferences() {
    }
    
	public static void setTheme(int value){
		SharedPreferences.Editor editor = getPrefs().edit();
		editor.putInt(CURRENT_THEME, value);
		editor.commit();
	}
	
	public static int getTheme()
	{		
		switch(getCurrentTheme())
		{
		case 0:
			return R.style.MmsHoloLight;
		case 1:
			return R.style.MmsHoloLightDarkAction;
		case 2:
			return R.style.MmsHoloDark;
		default:
			return R.style.MmsHoloDark;
		}
	}
	
	public static int getCurrentTheme(){
		return getPrefs().getInt(CURRENT_THEME, 1); // #1 is the Dark Actionbar
	}

	private static SharedPreferences getPrefs() {
        return mContext.getSharedPreferences(THEME_SETTINGS_NAME, Context.MODE_PRIVATE);
    }
}

