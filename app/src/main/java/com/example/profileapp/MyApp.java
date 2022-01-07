package com.example.profileapp;

import android.app.Application;
import android.graphics.Typeface;

public class MyApp extends Application {
    private static Typeface iranianSansFont;

    @Override
    public void onCreate() {
        super.onCreate();
        iranianSansFont=Typeface.createFromAsset(getAssets(),"iranian_Sans.ttf");
    }

    public static Typeface getIranianSansFont() {
        return iranianSansFont;
    }
}
