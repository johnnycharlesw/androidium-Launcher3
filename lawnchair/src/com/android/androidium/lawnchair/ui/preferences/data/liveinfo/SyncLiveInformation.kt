package com.android.androidium.lawnchair.ui.preferences.data.liveinfo

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import com.android.androidium.lawnchair.preferences2.asState

@Composable
fun SyncLiveInformation(
    liveInformationManager: LiveInformationManager = liveInformationManager(),
) {
    val enabled by liveInformationManager.enabled.asState()
    val endpoint by liveInformationManager.endpoint.asState()

    LaunchedEffect(enabled, endpoint) {
        if (enabled) {
            getLiveInformation(endpoint)?.let { liveInformation ->
                liveInformationManager.liveInformation.set(liveInformation)
            }
        }
    }
}
