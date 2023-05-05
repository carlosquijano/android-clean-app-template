package io.github.carlosquijano.appx.ui.design.root

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import io.github.carlosquijano.appx.ui.design.scaffold.ScaffoldView

@Composable
fun RootNavHost(
    navController : NavHostController,
) {
    NavHost(
        route = RootNavRoutes.ROOT,
        navController = navController,
        startDestination = RootNavRoutes.WELCOME,
    ) {
        // WELCOME route handler
        composable(route = RootNavRoutes.WELCOME) {
            Text(text = "WELCOME")
        }
        // In the code line above
        // We add the auth navigation graph to this nav host controller
        authNavGraph(
            navController = navController
        )
        // In the code line above
        // We add the main navigation graph to this nav host controller
        mainNavGraph(
            navController = navController
        )
    }
}
private fun NavGraphBuilder.authNavGraph(
    navController: NavHostController,
) {
    navigation(
        route = RootNavRoutes.AUTHENTICATION,
        startDestination = RootNavRoutes.LOGIN,
    ) {
        // LOGIN route handler
        composable(route = RootNavRoutes.LOGIN) {

        }

        // SIGNUP route handler
        composable(route = RootNavRoutes.SIGNUP) {

        }

        // FORGOT_PASSWORD route handler
        composable(route = RootNavRoutes.FORGOT_PASSWORD) {

        }
    }
}

private fun NavGraphBuilder.mainNavGraph(
    navController: NavHostController,
) {
    navigation(
        route = RootNavRoutes.MAIN,
        startDestination = RootNavRoutes.SCAFFOLD,
    ) {
        // SCAFFOLD route handler
        composable(route = RootNavRoutes.SCAFFOLD) {
            ScaffoldView()
        }
        // ABOUT route handler
        composable(route = RootNavRoutes.ABOUT) {
            // AboutView()
        }
    }
}
