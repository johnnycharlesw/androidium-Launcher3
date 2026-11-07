package com.android.androidium.lawnchair.gestures.handlers

import android.content.Context
import com.android.androidium.lawnchair.AndroidiumLauncher
import com.android.androidium.lawnchair.animateToAllApps

class OpenAppSearchGestureHandler(context: Context) : GestureHandler(context) {

    override suspend fun onTrigger(launcher: AndroidiumLauncher) {
        val searchUiManager = launcher.appsView.searchUiManager
        searchUiManager.setDirectFocus(true)
        searchUiManager.editText?.showKeyboard()
        launcher.animateToAllApps()
    }
}
