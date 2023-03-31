package io.github.cq.jetpackcompose.app.ux.features.navigation.nested

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import io.github.cq.jetpackcompose.app.domain.model.UserContext
import io.github.cq.jetpackcompose.app.ux.features.blank.BlankScreen
import io.github.cq.jetpackcompose.app.ux.features.navigation.NavRoutes
import io.github.cq.jetpackcompose.app.ux.features.profile.ProfileView
import io.github.cq.jetpackcompose.app.ux.features.profile.ProfileViewModel

fun NavGraphBuilder.homeNavGraph(
    userContext: UserContext,
    rootController: NavHostController,
    mainController: NavHostController,
) {
    navigation(
        route = NavRoutes.HOME,
        startDestination = NavRoutes.HOMEPAGE,
    ) {
        // Home navigation route
        composable(route = NavRoutes.HOMEPAGE) {
            BlankScreen(title = "HOMEPAGE")
        }

        // Profile navigation route
        composable(route = NavRoutes.PROFILE) {
            ProfileView(
                userContext = userContext,
                rootController = rootController,
                navController = mainController,
                viewModel = hiltViewModel(),
            )
        }

        // Settings navigation route
        composable(route = NavRoutes.SETTINGS) {
            val profileVM = hiltViewModel<ProfileViewModel>()
            BlankScreen(title = "SETTINGS for ${profileVM.username(context = userContext)}")
        }

        // Inbox navigation route
        composable(route = NavRoutes.INBOX) {
            BlankScreen(title = "INBOX")
        }

        // Notifications navigation route
        composable(route = NavRoutes.NOTIFICATIONS) {
            BlankScreen(title = "NOTIFICATIONS")
        }
    }
}
