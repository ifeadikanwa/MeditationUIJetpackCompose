package com.ifyezedev.meditationUIJetpackCompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import com.ifyezedev.meditationUIJetpackCompose.ui.HomeScreen
import com.ifyezedev.meditationUIJetpackCompose.ui.theme.MeditationUIJetpackComposeTheme

@ExperimentalFoundationApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MeditationUIJetpackComposeTheme {
                HomeScreen()
            }
        }
    }
}