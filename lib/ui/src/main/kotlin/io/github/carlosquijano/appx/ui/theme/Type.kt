package io.github.appfactoryhub.nano.lib.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

private val brandFontFamily = FontFamily.Serif
private val brandWeight = FontWeight.Bold
private val customFontFamily = FontFamily.SansSerif
private val customWeight = FontWeight.Normal

// Set of Material typography styles to start with
val CustomTypography = Typography(
    displaySmall = TextStyle(
        fontFamily = brandFontFamily,
        fontWeight = brandWeight,
        fontSize = 36.sp,
        lineHeight = 44.sp
    ),
    bodySmall = TextStyle(
        fontFamily = customFontFamily,
        fontWeight = customWeight,
        fontSize = 12.sp,
        lineHeight = 16.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = customFontFamily,
        fontWeight = customWeight,
        fontSize = 14.sp,
        lineHeight = 20.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = customFontFamily,
        fontWeight = customWeight,
        fontSize = 16.sp,
        lineHeight = 24.sp
    ),
    labelMedium = TextStyle(
        fontFamily = customFontFamily,
        fontWeight = customWeight,
        fontSize = 12.sp,
        lineHeight = 16.sp
    ),
    labelSmall = TextStyle(
        fontFamily = customFontFamily,
        fontWeight = customWeight,
        fontSize = 11.sp,
        lineHeight = 16.sp
    ),
    titleLarge = TextStyle(
        fontFamily = customFontFamily,
        fontWeight = customWeight,
        fontSize = 22.sp,
        lineHeight = 28.sp,
    ),
    titleMedium = TextStyle(
        fontFamily = customFontFamily,
        fontWeight = customWeight,
        fontSize = 16.sp,
        lineHeight = 24.sp
    ),
    titleSmall = TextStyle(
        fontFamily = customFontFamily,
        fontWeight = customWeight,
        fontSize = 14.sp,
        lineHeight = 20.sp
    ),
)