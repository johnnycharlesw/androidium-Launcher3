/*
 * Copyright 2021, Lawnchair
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.androidium.lawnchair.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.unit.sp

private val base = Typography()

val Typography = Typography(
    displayLarge = base.displayLarge.copy(fontFamily = Inter.Display.Emphasized.Large),
    displayMedium = base.displayMedium.copy(fontFamily = Inter.Display.Emphasized.Medium),
    displaySmall = base.displaySmall.copy(fontFamily = Inter.Display.Emphasized.Large),
    headlineLarge = base.headlineLarge.copy(fontFamily = Inter.Headline.Emphasized.Large),
    headlineMedium = base.headlineMedium.copy(fontFamily = Inter.Headline.Emphasized.Medium),
    headlineSmall = base.headlineSmall.copy(fontFamily = Inter.Headline.Emphasized.Large),
    titleLarge = base.titleLarge.copy(fontFamily = Inter.Title.Emphasized.Large),
    titleMedium = base.titleMedium.copy(fontFamily = Inter.Title.Emphasized.Medium),
    titleSmall = base.titleSmall.copy(fontFamily = Inter.Title.Emphasized.Small),
    bodyLarge = base.bodyLarge.copy(fontFamily = Inter.Body.Normal.Large, letterSpacing = 0.sp),
    bodyMedium = base.bodyMedium.copy(fontFamily = Inter.Body.Normal.Medium, letterSpacing = 0.1.sp),
    bodySmall = base.bodySmall.copy(fontFamily = Inter.Body.Normal.Small),
    labelLarge = base.labelLarge.copy(fontFamily = Inter.Label.Normal.Large),
    labelMedium = base.labelMedium.copy(fontFamily = Inter.Label.Normal.Medium),
    labelSmall = base.labelSmall.copy(fontFamily = Inter.Label.Normal.Small),
    displayLargeEmphasized = base.displayLargeEmphasized.copy(fontFamily = Inter.Display.Emphasized.Large),
    displayMediumEmphasized = base.displayMediumEmphasized.copy(fontFamily = Inter.Display.Emphasized.Medium),
    displaySmallEmphasized = base.displaySmallEmphasized.copy(fontFamily = Inter.Display.Emphasized.Large),
    headlineLargeEmphasized = base.headlineLargeEmphasized.copy(fontFamily = Inter.Headline.Emphasized.Large),
    headlineMediumEmphasized = base.headlineMediumEmphasized.copy(fontFamily = Inter.Headline.Emphasized.Medium),
    headlineSmallEmphasized = base.headlineSmallEmphasized.copy(fontFamily = Inter.Headline.Emphasized.Large),
    titleLargeEmphasized = base.titleLargeEmphasized.copy(fontFamily = Inter.Title.Emphasized.Large),
    titleMediumEmphasized = base.titleMediumEmphasized.copy(fontFamily = Inter.Title.Emphasized.Medium),
    titleSmallEmphasized = base.titleSmallEmphasized.copy(fontFamily = Inter.Title.Emphasized.Small),
    bodyLargeEmphasized = base.bodyLargeEmphasized.copy(fontFamily = Inter.Body.Emphasized.Large),
    bodyMediumEmphasized = base.bodyMediumEmphasized.copy(fontFamily = Inter.Body.Emphasized.Medium),
    bodySmallEmphasized = base.bodySmallEmphasized.copy(fontFamily = Inter.Body.Emphasized.Small),
    labelLargeEmphasized = base.labelLargeEmphasized.copy(fontFamily = Inter.Label.Emphasized.Large),
    labelMediumEmphasized = base.labelMediumEmphasized.copy(fontFamily = Inter.Label.Emphasized.Medium),
    labelSmallEmphasized = base.labelSmallEmphasized.copy(fontFamily = Inter.Label.Emphasized.Small),
)
