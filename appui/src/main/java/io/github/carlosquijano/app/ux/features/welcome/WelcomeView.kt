package io.github.carlosquijano.app.ux.features.welcome

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import com.github.carlosquijano.androidjetpacktemplate.app.ui.features.navigation.NavRoutes
import io.github.carlosquijano.app.ui.R

/**
 * Welcome composable view.
 *
 * @param rootController the root navigation controller for this view.
 */
@Composable
fun WelcomeView(
    rootController: NavHostController,
) {
    // In the next code line
    // Create the composable welcome screen
    WelcomeScreen(
        title = stringResource(id = R.string.welcome).lowercase(),
        onClickLogin = {
            rootController.navigate(NavRoutes.LOGIN)
        },
        onClickSignup = {
            rootController.navigate(NavRoutes.SIGNUP)
        },
    )
}
