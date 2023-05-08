package io.github.carlosquijano.appx.ui.design.welcome

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import io.github.carlosquijano.appx.ui.design.root.RootNavRoutes

@Composable
fun WelcomeView(
    navController: NavHostController,
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            modifier = Modifier.clickable { navigateTo(navController, RootNavRoutes.WELCOME) },
            text = "Welcome",
            style = MaterialTheme.typography.titleMedium
        )
        Text(
            modifier = Modifier.clickable { navigateTo(navController, RootNavRoutes.LOGIN) },
            text = "Login",
            style = MaterialTheme.typography.titleSmall
        )
        Text(
            modifier = Modifier.clickable { navigateTo(navController, RootNavRoutes.SIGNUP) },
            text = "Register",
            style = MaterialTheme.typography.titleSmall
        )
        Text(
            modifier = Modifier.clickable {
                navController.popBackStack(); navigateTo(navController, RootNavRoutes.MAIN)
            },
            text = "Skip",
            style = MaterialTheme.typography.titleSmall
        )
    }
}

private fun navigateTo(navController: NavHostController, route: String) {
    navController.navigate(route) {
        launchSingleTop = true
    }
}

@Preview
@Composable
fun WelcomeViewPreview() {
    WelcomeView(rememberNavController())
}