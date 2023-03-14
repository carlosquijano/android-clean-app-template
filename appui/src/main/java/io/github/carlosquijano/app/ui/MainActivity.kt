package io.github.carlosquijano.app.ui

import android.app.Application
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.HiltAndroidApp
import io.github.carlosquijano.app.ux.common.AppSurface
import io.github.carlosquijano.app.ux.common.Greeting

@HiltAndroidApp
class MainApplication : Application()

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppSurface {
                Greeting(
                    Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    name = "Android",
                )
            }
        }
    }
}
