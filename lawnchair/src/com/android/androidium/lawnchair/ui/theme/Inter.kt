package com.android.androidium.lawnchair.ui.theme

import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontVariation
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.android.launcher3.R

// Typography structure inspired by https://gitlab.com/nongthaihoang/google-sans-prime/-/commit/0f7b9d29f6ffe5005d22d81af264a86106f2450d
object Inter {
    object Display {
        object Normal {
            /**
             * Inter Normal (400), Normal
             *
             **/
            @OptIn(ExperimentalTextApi::class)
            val Large = FontFamily(
                Font(
                    R.font.inter_variable,
                    variationSettings = FontVariation.Settings(
                        FontVariation.weight(FontWeight.Normal.weight),
                        FontVariation.opticalSizing(57.sp),
                    ),
                ),
            )

            /**
             * Inter Normal (400), Normal
             *
             **/
            @OptIn(ExperimentalTextApi::class)
            val Medium = FontFamily(
                Font(
                    R.font.inter_variable,
                    variationSettings = FontVariation.Settings(
                        FontVariation.weight(FontWeight.Normal.weight),
                        FontVariation.opticalSizing(45.sp),
                    ),
                ),
            )

            /**
             * Inter Normal (400), Normal
             *
             **/
            @OptIn(ExperimentalTextApi::class)
            val Small = FontFamily(
                Font(
                    R.font.inter_variable,
                    variationSettings = FontVariation.Settings(
                        FontVariation.weight(FontWeight.Normal.weight),
                        FontVariation.opticalSizing(36.sp),
                    ),
                ),
            )
        }
        object Emphasized {
            /**
             * Inter Medium (500), Emphasized
             *
             **/
            @OptIn(ExperimentalTextApi::class)
            val Large = FontFamily(
                Font(
                    R.font.inter_variable,
                    variationSettings = FontVariation.Settings(
                        FontVariation.weight(FontWeight.Medium.weight),
                        FontVariation.opticalSizing(57.sp),
                    ),
                ),
            )

            /**
             * Inter Medium (500), Emphasized
             *
             **/
            @OptIn(ExperimentalTextApi::class)
            val Medium = FontFamily(
                Font(
                    R.font.inter_variable,
                    variationSettings = FontVariation.Settings(
                        FontVariation.weight(FontWeight.Medium.weight),
                        FontVariation.opticalSizing(45.sp),
                    ),
                ),
            )

            /**
             * Inter Medium (500), Emphasized
             *
             **/
            @OptIn(ExperimentalTextApi::class)
            val Small = FontFamily(
                Font(
                    R.font.inter_variable,
                    variationSettings = FontVariation.Settings(
                        FontVariation.weight(FontWeight.Medium.weight),
                        FontVariation.opticalSizing(36.sp),
                    ),
                ),
            )
        }
    }
    object Headline {
        object Normal {
            /**
             * Inter Normal (400), Normal
             *
             **/
            @OptIn(ExperimentalTextApi::class)
            val Large = FontFamily(
                Font(
                    R.font.inter_variable,
                    variationSettings = FontVariation.Settings(
                        FontVariation.weight(FontWeight.Normal.weight),
                        FontVariation.opticalSizing(32.sp),
                    ),
                ),
            )

            /**
             * Inter Normal (400), Normal
             *
             **/
            @OptIn(ExperimentalTextApi::class)
            val Medium = FontFamily(
                Font(
                    R.font.inter_variable,
                    variationSettings = FontVariation.Settings(
                        FontVariation.weight(FontWeight.Normal.weight),
                        FontVariation.opticalSizing(28.sp),
                    ),
                ),
            )

            /**
             * Inter Normal (400), Normal
             *
             **/
            @OptIn(ExperimentalTextApi::class)
            val Small = FontFamily(
                Font(
                    R.font.inter_variable,
                    variationSettings = FontVariation.Settings(
                        FontVariation.weight(FontWeight.Normal.weight),
                        FontVariation.opticalSizing(24.sp),
                    ),
                ),
            )
        }
        object Emphasized {
            /**
             * Inter Medium (500), Emphasized
             *
             **/
            @OptIn(ExperimentalTextApi::class)
            val Large = FontFamily(
                Font(
                    R.font.inter_variable,
                    variationSettings = FontVariation.Settings(
                        FontVariation.weight(FontWeight.Medium.weight),
                        FontVariation.opticalSizing(32.sp),
                    ),
                ),
            )

            /**
             * Inter Medium (500), Emphasized
             *
             **/
            @OptIn(ExperimentalTextApi::class)
            val Medium = FontFamily(
                Font(
                    R.font.inter_variable,
                    variationSettings = FontVariation.Settings(
                        FontVariation.weight(FontWeight.Medium.weight),
                        FontVariation.opticalSizing(28.sp),
                    ),
                ),
            )

            /**
             * Inter Medium (500), Emphasized
             *
             **/
            @OptIn(ExperimentalTextApi::class)
            val Small = FontFamily(
                Font(
                    R.font.inter_variable,
                    variationSettings = FontVariation.Settings(
                        FontVariation.weight(FontWeight.Medium.weight),
                        FontVariation.opticalSizing(24.sp),
                    ),
                ),
            )
        }
    }
    object Title {
        object Normal {
            /**
             * Inter Medium (500), Normal
             *
             **/
            @OptIn(ExperimentalTextApi::class)
            val Large = FontFamily(
                Font(
                    R.font.inter_variable,
                    variationSettings = FontVariation.Settings(
                        FontVariation.opticalSizing(22.sp),
                    ),
                ),
            )

            /**
             * Inter Medium (500), Normal
             *
             **/
            @OptIn(ExperimentalTextApi::class)
            val Medium = FontFamily(
                Font(
                    R.font.inter_variable,
                    variationSettings = FontVariation.Settings(
                        FontVariation.weight(FontWeight.Medium.weight),
                        FontVariation.opticalSizing(16.sp),
                    ),
                ),
            )

            /**
             * Inter Medium (500), Normal
             *
             **/
            @OptIn(ExperimentalTextApi::class)
            val Small = FontFamily(
                Font(
                    R.font.inter_variable,
                    variationSettings = FontVariation.Settings(
                        FontVariation.weight(FontWeight.Medium.weight),
                        FontVariation.opticalSizing(14.sp),
                    ),
                ),
            )
        }
        object Emphasized {
            /**
             * Inter Medium (500), Emphasized
             *
             **/
            @OptIn(ExperimentalTextApi::class)
            val Large = FontFamily(
                Font(
                    R.font.inter_variable,
                    variationSettings = FontVariation.Settings(
                        FontVariation.weight(FontWeight.Medium.weight),
                        FontVariation.opticalSizing(22.sp),
                    ),
                ),
            )

            /**
             * Inter Medium (500), Emphasized
             *
             **/
            @OptIn(ExperimentalTextApi::class)
            val Medium = FontFamily(
                Font(
                    R.font.inter_variable,
                    variationSettings = FontVariation.Settings(
                        FontVariation.weight(FontWeight.Medium.weight),
                        FontVariation.opticalSizing(16.sp),
                    ),
                ),
            )

            /**
             * Inter Medium (500), Emphasized
             *
             **/
            @OptIn(ExperimentalTextApi::class)
            val Small = FontFamily(
                Font(
                    R.font.inter_variable,
                    variationSettings = FontVariation.Settings(
                        FontVariation.weight(FontWeight.Medium.weight),
                        FontVariation.opticalSizing(14.sp),
                    ),
                ),
            )
        }
    }
    object Body {
        object Normal {
            /**
             * Inter Normal (400), Normal
             *
             **/
            @OptIn(ExperimentalTextApi::class)
            val Large = FontFamily(
                Font(
                    R.font.inter_variable,
                    variationSettings = FontVariation.Settings(
                        FontVariation.weight(FontWeight.Normal.weight),
                        FontVariation.opticalSizing(16.sp),
                    ),
                ),
            )

            /**
             * Inter Normal (400), Normal
             *
             **/
            @OptIn(ExperimentalTextApi::class)
            val Medium = FontFamily(
                Font(
                    R.font.inter_variable,
                    variationSettings = FontVariation.Settings(
                        FontVariation.weight(FontWeight.Normal.weight),
                        FontVariation.opticalSizing(14.sp),
                    ),
                ),
            )

            /**
             * Inter Normal (400), Normal
             *
             **/
            @OptIn(ExperimentalTextApi::class)
            val Small = FontFamily(
                Font(
                    R.font.inter_variable,
                    variationSettings = FontVariation.Settings(
                        FontVariation.weight(FontWeight.Normal.weight),
                        FontVariation.opticalSizing(12.sp),
                    ),
                ),
            )
        }
        object Emphasized {
            /**
             * Inter Medium (500), Emphasized
             *
             **/
            @OptIn(ExperimentalTextApi::class)
            val Large = FontFamily(
                Font(
                    R.font.inter_variable,
                    variationSettings = FontVariation.Settings(
                        FontVariation.weight(FontWeight.Medium.weight),
                        FontVariation.opticalSizing(16.sp),
                    ),
                ),
            )

            /**
             * Inter Medium (500), Emphasized
             *
             **/
            @OptIn(ExperimentalTextApi::class)
            val Medium = FontFamily(
                Font(
                    R.font.inter_variable,
                    variationSettings = FontVariation.Settings(
                        FontVariation.weight(FontWeight.Medium.weight),
                        FontVariation.opticalSizing(14.sp),
                    ),
                ),
            )

            /**
             * Inter Medium (500), Emphasized
             *
             **/
            @OptIn(ExperimentalTextApi::class)
            val Small = FontFamily(
                Font(
                    R.font.inter_variable,
                    variationSettings = FontVariation.Settings(
                        FontVariation.weight(FontWeight.Medium.weight),
                        FontVariation.opticalSizing(12.sp),
                    ),
                ),
            )
        }
    }
    object Label {
        object Normal {
            /**
             * Inter Medium (500), Normal
             *
             **/
            @OptIn(ExperimentalTextApi::class)
            val Small = FontFamily(
                Font(
                    R.font.inter_variable,
                    variationSettings = FontVariation.Settings(
                        FontVariation.weight(FontWeight.Medium.weight),
                        FontVariation.opticalSizing(11.sp),
                    ),
                ),
            )

            /**
             * Inter Medium (500), Normal
             *
             **/
            @OptIn(ExperimentalTextApi::class)
            val Medium = FontFamily(
                Font(
                    R.font.inter_variable,
                    variationSettings = FontVariation.Settings(
                        FontVariation.weight(FontWeight.Medium.weight),
                        FontVariation.opticalSizing(12.sp),
                    ),
                ),
            )

            /**
             * Inter Medium (500), Normal
             *
             **/
            @OptIn(ExperimentalTextApi::class)
            val Large = FontFamily(
                Font(
                    R.font.inter_variable,
                    variationSettings = FontVariation.Settings(
                        FontVariation.weight(FontWeight.Medium.weight),
                        FontVariation.opticalSizing(14.sp),
                    ),
                ),
            )
        }
        object Emphasized {
            /**
             * Inter Semibold (600), Emphasized
             *
             **/
            @OptIn(ExperimentalTextApi::class)
            val Small = FontFamily(
                Font(
                    R.font.inter_variable,
                    variationSettings = FontVariation.Settings(
                        FontVariation.weight(FontWeight.SemiBold.weight),
                        FontVariation.opticalSizing(11.sp),
                    ),
                ),
            )

            /**
             * Inter Semibold (600), Emphasized
             *
             **/
            @OptIn(ExperimentalTextApi::class)
            val Medium = FontFamily(
                Font(
                    R.font.inter_variable,
                    variationSettings = FontVariation.Settings(
                        FontVariation.weight(FontWeight.SemiBold.weight),
                        FontVariation.opticalSizing(12.sp),
                    ),
                ),
            )

            /**
             * Inter Semibold (600), Emphasized
             *
             **/
            @OptIn(ExperimentalTextApi::class)
            val Large = FontFamily(
                Font(
                    R.font.inter_variable,
                    variationSettings = FontVariation.Settings(
                        FontVariation.weight(FontWeight.SemiBold.weight),
                        FontVariation.opticalSizing(14.sp),
                    ),
                ),
            )
        }
    }
}
