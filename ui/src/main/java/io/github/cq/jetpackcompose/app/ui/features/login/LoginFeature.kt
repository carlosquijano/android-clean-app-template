package io.github.cq.jetpackcompose.app.ui.features.login

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import io.github.cq.jetpackcompose.app.ux.features.UIFeature

class LoginFeature(
    private val navController: NavHostController,
) : UIFeature {
    @Composable
    override fun TryFeature() {
        LoginView(navController = navController)
    }
}
