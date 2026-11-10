package com.android.androidium.lawnchair.compatlib.eleven;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.android.androidium.lawnchair.compatlib.ActivityManagerCompat;
import com.android.androidium.lawnchair.compatlib.ActivityOptionsCompat;
import com.android.androidium.lawnchair.compatlib.ten.QuickstepCompatFactoryVQ;

@RequiresApi(30)
public class QuickstepCompatFactoryVR extends QuickstepCompatFactoryVQ {

    @NonNull
    @Override
    public ActivityManagerCompat getActivityManagerCompat() {
        return new ActivityManagerCompatVR();
    }

    @NonNull
    @Override
    public ActivityOptionsCompat getActivityOptionsCompat() {
        return new ActivityOptionsCompatVR();
    }
}
