package io.github.carlosquijano.app.ux.features.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.github.carlosquijano.androidjetpacktemplate.app.ui.features.navigation.NavRoutes
import io.github.carlosquijano.app.domain.model.UserContext
import io.github.carlosquijano.app.ux.features.scaffold.ScaffoldScreen
import io.github.carlosquijano.app.ux.features.welcome.WelcomeView

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
    rootController: NavHostController = rememberNavController(),
) {
    // In the code line above
    // We create a NavHost for the ROOT navigation graph
    NavHost(
        route = NavRoutes.ROOT,
        navController = rootController,
        startDestination = NavRoutes.WELCOME,
    ) {
        // In the next code line
        // We create the welcome composable to be added to the NavGraphBuilder
        composable(route = NavRoutes.WELCOME) {
            // In code the line above
            // we are constructing the welcome view
            WelcomeView(
                rootController = rootController,
            )
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
