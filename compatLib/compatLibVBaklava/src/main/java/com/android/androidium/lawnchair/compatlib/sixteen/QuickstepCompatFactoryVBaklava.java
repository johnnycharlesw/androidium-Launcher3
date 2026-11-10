package com.android.androidium.lawnchair.compatlib.sixteen;

import android.window.RemoteTransition;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.android.androidium.lawnchair.compatlib.ActivityManagerCompat;
import com.android.androidium.lawnchair.compatlib.ActivityOptionsCompat;
import com.android.androidium.lawnchair.compatlib.RemoteTransitionCompat;
import com.android.androidium.lawnchair.compatlib.fifteen.QuickstepCompatFactoryVV;

@RequiresApi(36)
public class QuickstepCompatFactoryVBaklava extends QuickstepCompatFactoryVV {

    @NonNull
    @Override
    public ActivityManagerCompat getActivityManagerCompat() {
        return new ActivityManagerCompatVBaklava();
    }

    @NonNull
    @Override
    public ActivityOptionsCompat getActivityOptionsCompat() {
        return new ActivityOptionsCompatVBaklava();
    }

    @NonNull
    @Override
    public RemoteTransitionCompat getRemoteTransitionCompat() {
        return RemoteTransition::new;
    }
}
