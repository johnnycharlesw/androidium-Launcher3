package com.android.androidium.lawnchair.search.algorithms.engine

import android.content.Context

interface SearchPermission {
    fun checkPermission(context: Context): Any
}
