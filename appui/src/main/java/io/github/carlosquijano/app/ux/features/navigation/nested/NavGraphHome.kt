package io.github.carlosquijano.app.ux.features.navigation

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.github.carlosquijano.androidjetpacktemplate.app.ui.features.navigation.NavRoutes
import com.github.carlosquijano.androidjetpacktemplate.app.ui.features.profile.ProfileViewModel
import io.github.carlosquijano.app.domain.model.UserContext
import io.github.carlosquijano.app.ux.features.blank.BlankScreen
import io.github.carlosquijano.app.ux.features.profile.ProfileView

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
            BlankScreen(name = "HOMEPAGE")
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
            BlankScreen(name = "SETTINGS for ${profileVM.username(context = userContext)}")
        }

        // Inbox navigation route
        composable(route = NavRoutes.INBOX) {
            BlankScreen(name = "INBOX")
        }

        // Notifications navigation route
        composable(route = NavRoutes.NOTIFICATIONS) {
            BlankScreen(name = "NOTIFICATIONS")
        }
    }
}
