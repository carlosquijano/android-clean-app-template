package io.github.carlosquijano.appx.ui.design.scaffold

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation

@Composable
fun ScaffoldNavHost(
    navController: NavHostController,
) {
    NavHost(
        route = ScaffoldNavRoutes.HOME,
        navController = navController,
        startDestination = ScaffoldNavRoutes.TABS,
    ) {
        homeNavGraph(navController)
    }
}

private fun NavGraphBuilder.homeNavGraph(
    navController: NavHostController,
) {
    navigation(
        route = ScaffoldNavRoutes.TABS,
        startDestination = ScaffoldNavRoutes.LANDING,
    ) {
        // LANDING route handler
        composable(route = ScaffoldNavRoutes.LANDING) {
            Text(text = "LANDING")
        }

        // EXPLORE route handler
        composable(route = ScaffoldNavRoutes.EXPLORE) {
            Text(text = "EXPLORE")
        }

        // NOTIFICATIONS route handler
        composable(route = ScaffoldNavRoutes.NOTIFICATIONS) {
            Text(text = "NOTIFICATIONS")
        }

        // INBOX route handler
        composable(route = ScaffoldNavRoutes.INBOX) {
            Text(text = "INBOX")
        }

        // SETTINGS route handler
        composable(route = ScaffoldNavRoutes.SETTINGS) {
            Text(text = "SETTINGS")
        }

        // PROFILE route handler
        composable(route = ScaffoldNavRoutes.PROFILE) {
            Text(text = "PROFILE")
        }

        // EXPLORE route handler
        composable(route = ScaffoldNavRoutes.EXPLORE) {
            Text(text = "EXPLORE")
        }

        // FAVORITES route handler
        composable(route = ScaffoldNavRoutes.FAVORITES) {
            Text(text = "FAVORITES")
        }

        // SHOPPING_CART route handler
        composable(route = ScaffoldNavRoutes.SHOPPING_CART) {
            Text(text = "SHOPPING_CART")
        }
    }
}