package com.example.krnfallex.krnfall;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by NarwhalZ on 31/1/2560.
 */

public class MyFont extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initFont();
    }
    //      ปรับ Fonts
    private void initFont() {
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/promptlight.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }
}