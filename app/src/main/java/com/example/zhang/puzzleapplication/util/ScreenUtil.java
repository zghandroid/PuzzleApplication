package com.example.zhang.puzzleapplication.util;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

public class ScreenUtil {
 
    /**
     * 获取屏幕相关参数
     * 
     * @param context
     * @return DisplayMetrics 屏幕宽高
     */
    public static DisplayMetrics getScreenSize(Context context) {
        DisplayMetrics metrics = new DisplayMetrics();
	WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
	Display display = wm.getDefaultDisplay();
	display.getMetrics(metrics);
	return metrics;
    }
}
