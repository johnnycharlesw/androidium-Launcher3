package com.android.androidium.lawnchair.compatlib.fourteen;

import android.window.RemoteTransition;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.android.androidium.lawnchair.compatlib.ActivityManagerCompat;
import com.android.androidium.lawnchair.compatlib.ActivityOptionsCompat;
import com.android.androidium.lawnchair.compatlib.RemoteTransitionCompat;
import com.android.androidium.lawnchair.compatlib.thirteen.QuickstepCompatFactoryVT;

@RequiresApi(34)
public class QuickstepCompatFactoryVU extends QuickstepCompatFactoryVT {

    @NonNull
    @Override
    public ActivityManagerCompat getActivityManagerCompat() {
        return new ActivityManagerCompatVU();
    }

    @NonNull
    @Override
    public ActivityOptionsCompat getActivityOptionsCompat() {
        return new ActivityOptionsCompatVU();
    }

    @NonNull
    @Override
    public RemoteTransitionCompat getRemoteTransitionCompat() {
        return RemoteTransition::new;
    }
}
