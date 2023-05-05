package io.github.carlosquijano.appx.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import io.github.appfactoryhub.nano.lib.ui.theme.PurpleTealAppTheme
import io.github.carlosquijano.appx.ui.design.root.RootView

/**
 * TODO - MainActivity documentation
 */
@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PurpleTealAppTheme {
                RootView(
                    navController = rememberNavController()
                )
            }
        }
    }
}