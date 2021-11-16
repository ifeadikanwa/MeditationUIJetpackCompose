package com.ifyezedev.meditationUIJetpackCompose.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun MeditationUIJetpackComposeTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit) {
    MaterialTheme(
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}