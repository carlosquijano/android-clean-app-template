package io.github.carlosquijano.app.ux.features.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.github.carlosquijano.androidjetpacktemplate.app.ui.features.navigation.NavRoutes
import io.github.carlosquijano.app.ux.features.blank.BlankScreen
import io.github.carlosquijano.app.ux.features.login.LoginFeature

/**
 * This function is responsible for building the authentication navigation graph, which consists
 * of three screens: LOGIN, SIGNUP, and FORGOT_PASSWORD. The navigation graph is built using the
 * NavGraphBuilder API, which allows for a declarative approach to defining the navigation flow
 * of the application. The navController parameter is the navigation controller that will be used
 * to manage the navigation stack for this graph.
 *
 * Each screen is represented by a destination within the navigation graph, and is associated with
 * a corresponding fragment that displays the UI for that screen. The LOGIN screen is the initial
 * destination of the graph, and is displayed when the user first enters the authentication flow.
 * The SIGNUP and FORGOT_PASSWORD screens can be accessed via links from the LOGIN screen, and
 * provide additional functionality for creating a new account or resetting a forgotten password.
 *
 * @param navController the navigation controller that will be used to manage the navigation stack
 * for this graph.
 */
fun NavGraphBuilder.authNavGraph(navController: NavHostController) {
    navigation(
        route = NavRoutes.AUTHENTICATION,
        startDestination = NavRoutes.LOGIN,
    ) {
        // In the next code line
        // Composable for the LOGIN navigation route
        composable(route = NavRoutes.LOGIN) {
            LoginFeature(
                navController = navController,
            ).TryFeature()
        }

        // In the next code line
        // Composable for the SIGNUP navigation route
        composable(route = NavRoutes.SIGNUP) {
            BlankScreen(name = "SIGNUP")
        }

        // In the next code line
        // Composable for the FORGOT_PASSWORD navigation route
        composable(route = NavRoutes.FORGOT_PASSWORD) {
            BlankScreen(name = "FORGOT_PASSWORD")
        }
    }
}
