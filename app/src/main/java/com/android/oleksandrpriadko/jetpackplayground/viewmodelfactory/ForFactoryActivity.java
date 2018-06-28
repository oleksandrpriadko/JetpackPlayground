package com.android.oleksandrpriadko.jetpackplayground.viewmodelfactory;

import android.annotation.SuppressLint;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Copyright © 2018 CrownBet Pty Limited. All rights reserved.
 * Created By Love Agency
 */
@SuppressLint("Registered")
final class ForFactoryActivity extends AppCompatActivity {

    private FromFactoryViewModel mFromFactoryViewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ViewModelFactory viewModelFactory = new ViewModelFactory("parameter");
        mFromFactoryViewModel = ViewModelProviders
            .of(this, viewModelFactory)
            .get(FromFactoryViewModel.class);
    }
}
