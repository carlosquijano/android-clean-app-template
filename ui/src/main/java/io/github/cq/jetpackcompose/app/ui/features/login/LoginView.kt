package io.github.cq.jetpackcompose.app.ui.features.login

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import io.github.cq.jetpackcompose.app.ux.features.login.LoginScreen
import io.github.cq.jetpackcompose.app.ux.features.navigation.NavRoutes

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
