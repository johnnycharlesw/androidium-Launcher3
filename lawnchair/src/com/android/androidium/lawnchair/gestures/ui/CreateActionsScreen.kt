package com.android.androidium.lawnchair.gestures.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import com.android.androidium.lawnchair.gestures.config.GestureHandlerConfig
import com.android.androidium.lawnchair.gestures.config.GestureHandlerOption
import com.android.androidium.lawnchair.gestures.config.buildConfigFrom
import com.android.androidium.lawnchair.gestures.config.filterGestureHandlerOptions
import com.android.androidium.lawnchair.preferences.getAdapter
import com.android.androidium.lawnchair.preferences2.preferenceManager2
import com.android.androidium.lawnchair.ui.preferences.components.controls.ClickablePreference
import com.android.androidium.lawnchair.ui.preferences.components.layout.PreferenceLayoutLazyColumn
import com.android.androidium.lawnchair.ui.preferences.components.layout.preferenceGroupItems
import com.android.launcher3.R
import kotlinx.coroutines.launch

@Composable
fun CreateActionsScreen(
    modifier: Modifier = Modifier,
    onSelect: (GestureHandlerConfig) -> Unit,
) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()

    val prefs2 = preferenceManager2()
    val newOptions =
        filterGestureHandlerOptions(deckLayoutEnabled = prefs2.deckLayout.getAdapter().state.value)

    fun onClick(option: GestureHandlerOption) {
        scope.launch {
            val config = option.buildConfigFrom(context) ?: return@launch
            onSelect(config)
        }
    }

    PreferenceLayoutLazyColumn(
        label = stringResource(id = R.string.lawnchair_actions),
        modifier = modifier,
    ) {
        preferenceGroupItems(items = newOptions, isFirstChild = true) { _, it ->
            ClickablePreference(
                label = it.getLabel(context),
                onClick = { onClick(it) },
            )
        }
    }
}
