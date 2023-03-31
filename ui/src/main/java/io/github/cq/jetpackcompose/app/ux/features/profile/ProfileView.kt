package io.github.cq.jetpackcompose.app.ux.features.profile

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import io.github.cq.jetpackcompose.app.domain.model.UserContext
import io.github.cq.jetpackcompose.app.ux.features.navigation.NavRoutes

@Composable
fun ProfileView(
    userContext: UserContext,
    viewModel: ProfileViewModel,
    rootController: NavHostController,
    navController: NavHostController,
) {
    ProfileScreen(
        username = viewModel.username(userContext),
        onClickLogout = {
            rootController.popBackStack()
            rootController.navigate(NavRoutes.WELCOME)
        },
    )
}
