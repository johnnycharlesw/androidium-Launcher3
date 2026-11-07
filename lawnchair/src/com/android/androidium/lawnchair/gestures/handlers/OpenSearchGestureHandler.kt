package com.android.androidium.lawnchair.gestures.handlers

import android.content.Context
import com.android.androidium.lawnchair.AndroidiumLauncher
import com.android.androidium.lawnchair.preferences2.PreferenceManager2
import com.android.androidium.lawnchair.qsb.LawnQsbLayout

class OpenSearchGestureHandler(context: Context) : GestureHandler(context) {

    override suspend fun onTrigger(launcher: AndroidiumLauncher) {
        val prefs = PreferenceManager2.getInstance(launcher)
        val searchProvider = LawnQsbLayout.getSearchProvider(launcher, prefs)
        searchProvider.launch(launcher)
    }
}
