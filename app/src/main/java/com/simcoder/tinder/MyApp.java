package com.simcoder.tinder;

import android.app.Application;

import com.cloudinary.android.MediaManager;

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        MediaManager.init(this);


    }
}
