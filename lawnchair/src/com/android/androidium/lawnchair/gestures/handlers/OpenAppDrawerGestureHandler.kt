package com.android.androidium.lawnchair.gestures.handlers

import android.content.Context
import com.android.androidium.lawnchair.AndroidiumLauncher
import com.android.androidium.lawnchair.animateToAllApps

class OpenAppDrawerGestureHandler(context: Context) : GestureHandler(context) {

    override suspend fun onTrigger(launcher: AndroidiumLauncher) {
        launcher.animateToAllApps()
    }
}
