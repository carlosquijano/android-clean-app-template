package io.github.carlosquijano.app.ux.features.login

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.github.carlosquijano.androidjetpacktemplate.app.ui.features.navigation.NavRoutes
import io.github.carlosquijano.app.ux.features.login.screen.LoginScreen

@Composable
fun LoginView(
    viewModel: LoginViewModel = hiltViewModel(),
    navController: NavHostController,
) {
    LoginScreen(
        username = viewModel.username,
        password = viewModel.password,
        isSubmitEnabled = viewModel.validate(),
        onUsernameChange = { u -> viewModel.username = u },
        onPasswordChange = { p -> viewModel.password = p },
        onForgotClick = {
            navController.navigate(NavRoutes.FORGOT_PASSWORD) {
                launchSingleTop = true
            }
        },
        onSignup = {
            navController.navigate(NavRoutes.SIGNUP) {
                launchSingleTop = true
            }
        },
        onSubmit = {
            viewModel.login {
                navController.popBackStack()
                navController.navigate("${NavRoutes.MAIN}?username=${viewModel.username}")
            }
        },
    )
}
