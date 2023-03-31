package io.github.cq.jetpackcompose.app.ui.features.welcome

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import io.github.cq.jetpackcompose.app.ui.R
import io.github.cq.jetpackcompose.app.ux.features.navigation.NavRoutes
import io.github.cq.jetpackcompose.app.ux.features.welcome.WelcomeScreen

/**
 * Welcome composable view.
 *
 * @param navController the root navigation controller for this view.
 */
@Composable
fun WelcomeView(
    navController: NavHostController,
) {
    // In the next code line
    // We specify the composable welcome screen
    WelcomeScreen(
        // In the next code line
        // We specify the welcome screen title
        title = stringResource(id = R.string.welcome).lowercase(),

        // In the next code line
        // We specify the welcome screen login button text
        labelLogin = stringResource(id = R.string.login_label),

        // In the next code line
        // We specify the welcome screen signup button text
        labelSignup = stringResource(id = R.string.signup_label),

        // In the next code line
        // We specify the login button navigation event
        onClickLogin = {
            navController.navigate(NavRoutes.LOGIN)
        },

        // In the next code line
        // We specify the signup button navigation event
        onClickSignup = {
            navController.navigate(NavRoutes.SIGNUP)
        },
    )
}
