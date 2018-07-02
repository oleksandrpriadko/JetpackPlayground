package com.android.oleksandrpriadko.jetpackplayground.lifecycle;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;

/**
 * Copyright © 2018 CrownBet Pty Limited. All rights reserved.
 * Created By Love Agency
 */
class LifecycleSample implements LifecycleObserver {


    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    private void whenOnResume() {

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private void whenOnDestroy() {

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    private void whenOnStop() {

    }

}
