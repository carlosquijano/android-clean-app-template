package io.github.cq.jetpackcompose.app.ux.features.navigation.nested

import androidx.compose.runtime.Composable
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import io.github.cq.jetpackcompose.app.domain.model.UserContext
import io.github.cq.jetpackcompose.app.ui.features.welcome.WelcomeFeature
import io.github.cq.jetpackcompose.app.ux.features.navigation.NavRoutes
import io.github.cq.jetpackcompose.app.ux.features.scaffold.ScaffoldScreen

/**
 * Configure the application root navigation graph as follows:
 *
 * <pre>
 * - ROOT
 *   - WELCOME
 *   - AUTHENTICATION
 *   - MAIN SCAFFOLD
 * </pre>
 *
 * @param rootController the parent NavHostController to be used for the ROOT navigation host.
 */
@Composable
fun NestedNavigationGraph(
    startDestination: String = NavRoutes.WELCOME,
    rootController: NavHostController = rememberNavController(),
) {
    // In the code line above
    // We create a NavHost for the ROOT navigation graph
    NavHost(
        route = NavRoutes.ROOT,
        navController = rootController,
        startDestination = startDestination,
    ) {
        // In the next code line
        // We create the welcome composable to be added to the NavGraphBuilder
        composable(route = NavRoutes.WELCOME) {
            // In next code line
            // We load the welcome feature
            WelcomeFeature(
                navController = rootController,
            ).TryFeature()
        }

        // In the code line above
        // We create the auth navigation graph
        authNavGraph(rootController)

        // In the code line above
        // We create the main navigation graph for specific username
        composable(route = "${NavRoutes.MAIN}?username={username}") {
            val userContext = rememberSaveable(key = "userContext") {
                UserContext(
                    username = it.arguments?.getString("username") ?: "guest",
                )
            }

            // In the line above
            // We construct the scaffold screen
            ScaffoldScreen(
                rootController = rootController,
                userContext = userContext,
            )
        }
    }
}
