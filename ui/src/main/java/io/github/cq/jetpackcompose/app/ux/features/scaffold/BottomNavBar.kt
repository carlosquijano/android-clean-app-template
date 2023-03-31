package io.github.cq.jetpackcompose.app.ux.features.scaffold

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import io.github.cq.jetpackcompose.app.ui.R
import io.github.cq.jetpackcompose.app.ux.features.navigation.NavRoutes

@Composable
fun BottomNavBar(
    navController: NavHostController,
) {
    val screens = listOf(
        HomeNav.Home,
        HomeNav.Profile,
        HomeNav.Settings,
    )
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination
    val bottomBarDestination = screens.any { it.route == currentDestination?.route }
    if (bottomBarDestination) {
        NavigationBar {
            screens.forEach { screen ->
                AddItem(
                    screen = screen,
                    currentDestination = currentDestination,
                    navController = navController,
                )
            }
        }
    }
}

@Composable
private fun RowScope.AddItem(
    screen: HomeNav,
    currentDestination: NavDestination?,
    navController: NavHostController,
) {
    val selected = currentDestination?.hierarchy?.any { it.route == screen.route } == true

    NavigationBarItem(
        label = {
            Text(
                text = stringResource(id = screen.title),
            )
        },
        icon = {
            Icon(
                imageVector = if (selected) screen.selectedIcon else screen.icon,
                contentDescription = "Navigation Icon",
            )
        },
        selected = selected,
        onClick = {
            navController.navigate(screen.route) {
                popUpTo(navController.graph.findStartDestination().id) {
                    // this.saveState
                    // this.inclusive = true
                }
                launchSingleTop = true
            }
        },
    )
}

private sealed class HomeNav(
    val route: String,
    @StringRes val title: Int,
    val icon: ImageVector,
    val selectedIcon: ImageVector = icon,
) {
    object Home : HomeNav(
        route = NavRoutes.HOMEPAGE,
        title = R.string.homepage,
        icon = Icons.Outlined.Home,
        selectedIcon = Icons.Filled.Home,
    )

    object Profile : HomeNav(
        route = NavRoutes.PROFILE,
        title = R.string.profile,
        icon = Icons.Outlined.Person,
        selectedIcon = Icons.Filled.Person,
    )

    object Settings : HomeNav(
        route = NavRoutes.SETTINGS,
        title = R.string.settings,
        icon = Icons.Outlined.Settings,
        selectedIcon = Icons.Filled.Settings,
    )
}
