package com.android.androidium.lawnchair.smartspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.android.androidium.lawnchair.ui.preferences.PreferenceActivity
import com.android.androidium.lawnchair.ui.preferences.navigation.SmartspaceWidget

class SmartspacePreferencesShortcut : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(PreferenceActivity.createIntent(this, SmartspaceWidget))
        finish()
    }
}
