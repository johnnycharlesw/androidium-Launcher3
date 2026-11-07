package com.android.androidium.lawnchair.qsb.providers

import com.android.androidium.lawnchair.qsb.ThemingMethod
import com.android.launcher3.R

data object Thorium : QsbSearchProvider(
    id = "thorium",
    name = R.string.search_provider_thorium,
    icon = R.drawable.ic_cromite,
    themedIcon = R.drawable.ic_cromite_tinted,
    themingMethod = ThemingMethod.TINT,
    packageName = "com.alex313031.thorium",
    action = "android.intent.action.WEB_SEARCH",
    className = "org.chromium.chrome.browser.searchwidget.SearchActivity",
    website = "https://github.com/Alex313031/Thorium-Android/releases/latest",
    type = QsbSearchProviderType.APP,
    supportVoiceIntent = false,
)
