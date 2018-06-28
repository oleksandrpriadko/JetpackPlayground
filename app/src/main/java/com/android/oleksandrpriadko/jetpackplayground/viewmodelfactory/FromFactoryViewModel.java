package com.android.oleksandrpriadko.jetpackplayground.viewmodelfactory;

import android.arch.lifecycle.ViewModel;

/**
 * Copyright © 2018 CrownBet Pty Limited. All rights reserved.
 * Created By Love Agency
 */
class FromFactoryViewModel extends ViewModel {

    private final String mMessage;

    FromFactoryViewModel(String message) {
        mMessage = message;
    }
}
