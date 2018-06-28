package com.android.oleksandrpriadko.jetpackplayground.viewmodelfactory;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

class ViewModelFactory implements ViewModelProvider.Factory {

    private String mParameter;

    ViewModelFactory(String parameter) {
        mParameter = parameter;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (modelClass.isAssignableFrom(FromFactoryViewModel.class)) {
            return (T) new FromFactoryViewModel(mParameter);
        }
        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}