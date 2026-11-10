package com.android.androidium.lawnchair.compatlib.fifteen;

import android.window.RemoteTransition;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.android.androidium.lawnchair.compatlib.ActivityManagerCompat;
import com.android.androidium.lawnchair.compatlib.ActivityOptionsCompat;
import com.android.androidium.lawnchair.compatlib.RemoteTransitionCompat;
import com.android.androidium.lawnchair.compatlib.fourteen.QuickstepCompatFactoryVU;

@RequiresApi(35)
public class QuickstepCompatFactoryVV extends QuickstepCompatFactoryVU {

    @NonNull
    @Override
    public ActivityManagerCompat getActivityManagerCompat() {
        return new ActivityManagerCompatVV();
    }

    @NonNull
    @Override
    public ActivityOptionsCompat getActivityOptionsCompat() {
        return new ActivityOptionsCompatVV();
    }

    @NonNull
    @Override
    public RemoteTransitionCompat getRemoteTransitionCompat() {
        return RemoteTransition::new;
    }
}
