package com.android.androidium.lawnchair.compatlib.thirteen;

import android.window.RemoteTransition;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.android.androidium.lawnchair.compatlib.ActivityManagerCompat;
import com.android.androidium.lawnchair.compatlib.ActivityOptionsCompat;
import com.android.androidium.lawnchair.compatlib.RemoteTransitionCompat;
import com.android.androidium.lawnchair.compatlib.twelve.QuickstepCompatFactoryVS;

@RequiresApi(33)
public class QuickstepCompatFactoryVT extends QuickstepCompatFactoryVS {

    @NonNull
    @Override
    public ActivityManagerCompat getActivityManagerCompat() {
        return new ActivityManagerCompatVT();
    }

    @NonNull
    @Override
    public ActivityOptionsCompat getActivityOptionsCompat() {
        return new ActivityOptionsCompatVT();
    }

    @NonNull
    @Override
    public RemoteTransitionCompat getRemoteTransitionCompat() {
        return (remoteTransition, appThread, debugName) ->
                new RemoteTransition(remoteTransition, appThread);
    }
}
