package com.android.oleksandrpriadko.jetpackplayground.lifecycle;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Copyright © 2018 CrownBet Pty Limited. All rights reserved.
 * Created By Love Agency
 */
@SuppressLint("Registered")
public class LifecycleProviderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LifecycleSample lifecycleSample = new LifecycleSample();
        getLifecycle().addObserver(lifecycleSample);
    }
}
