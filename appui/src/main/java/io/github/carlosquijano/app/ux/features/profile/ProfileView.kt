package io.github.carlosquijano.app.ux.features.profile

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.github.carlosquijano.androidjetpacktemplate.app.ui.features.navigation.NavRoutes
import com.github.carlosquijano.androidjetpacktemplate.app.ui.features.profile.ProfileViewModel
import io.github.carlosquijano.app.domain.model.UserContext

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
