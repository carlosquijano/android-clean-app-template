package io.github.cq.jetpackcompose.app.ui.features.welcome

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import io.github.cq.jetpackcompose.app.ux.features.UIFeature

class WelcomeFeature(
    private val navController: NavHostController,
) : UIFeature {
    @Composable
    override fun TryFeature() {
        WelcomeView(navController = navController)
    }
}
