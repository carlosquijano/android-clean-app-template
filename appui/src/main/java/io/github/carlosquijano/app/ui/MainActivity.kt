package io.github.carlosquijano.app.ui

import android.app.Application
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.HiltAndroidApp
import io.github.carlosquijano.app.ui.common.AppSurface
import io.github.carlosquijano.app.ux.features.navigation.NavigationFeature

@HiltAndroidApp
class MainApplication : Application()

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppSurface {
                NavigationFeature().TryFeature()
            }
        }
    }
}
