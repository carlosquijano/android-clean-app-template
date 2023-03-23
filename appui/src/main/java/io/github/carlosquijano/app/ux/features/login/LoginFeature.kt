package io.github.carlosquijano.app.ux.features.login

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import io.github.carlosquijano.app.ux.features.UIFeature

class LoginFeature(
    private val navController: NavHostController,
) : UIFeature {
    @Composable
    override fun TryFeature() {
        LoginView(navController = navController)
    }
}
