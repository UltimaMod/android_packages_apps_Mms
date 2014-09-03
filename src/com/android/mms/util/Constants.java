package com.android.mms.util;

import android.content.Context;
import com.android.mms.MmsApp;

public interface Constants {
	
	public static Context CONTEXT = MmsApp.getContext();

	//Constant values for theme selection across multiple classes
	public static final String THEME_SETTINGS_NAME = "ThemeSettings";
	public static final String CURRENT_THEME = "current_theme";

}

