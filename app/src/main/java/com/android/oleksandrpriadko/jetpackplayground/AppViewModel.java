package com.android.oleksandrpriadko.jetpackplayground;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.MutableLiveData;
import android.support.annotation.NonNull;

/**
 * Copyright © 2018 CrownBet Pty Limited. All rights reserved.
 * Created By Love Agency
 */
public final class AppViewModel extends AndroidViewModel {

    private final MutableLiveData<String> mStringMutableLiveData = new MutableLiveData<>();

    AppViewModel(@NonNull Application application) {
        super(application);
    }

    public final MutableLiveData<String> getStringLiveData() {
        return mStringMutableLiveData;
    }
}
