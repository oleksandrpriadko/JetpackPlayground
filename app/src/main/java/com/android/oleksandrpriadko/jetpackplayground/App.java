package com.android.oleksandrpriadko.jetpackplayground;

import android.app.Application;

/**
 * Copyright © 2018 CrownBet Pty Limited. All rights reserved.
 * Created By Love Agency
 */
public final class App extends Application {

    private static AppViewModel sAppViewModel;

    @Override
    public void onCreate() {
        super.onCreate();

        sAppViewModel = new AppViewModel(this);

    }

    public static AppViewModel getAppViewModel() {
        return sAppViewModel;
    }
}
