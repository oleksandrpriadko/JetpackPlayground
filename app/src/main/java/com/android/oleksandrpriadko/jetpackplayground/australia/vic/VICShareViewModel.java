package com.android.oleksandrpriadko.jetpackplayground.australia.vic;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

/**
 * Copyright © 2018 CrownBet Pty Limited. All rights reserved.
 * Created By Love Agency
 */
public final class VICShareViewModel extends ViewModel {

    private final MutableLiveData<String> mStringMutableLiveData = new MutableLiveData<>();

    public final MutableLiveData<String> getStringMutableLiveData() {
        return mStringMutableLiveData;
    }
}
