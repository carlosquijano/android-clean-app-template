package io.github.carlosquijano.appx.ui.design.root

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun RootView(
    navController: NavHostController,
) {
    RootNavHost(navController = navController)
}
