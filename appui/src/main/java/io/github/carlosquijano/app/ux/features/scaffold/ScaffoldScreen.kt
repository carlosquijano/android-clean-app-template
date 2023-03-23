package io.github.carlosquijano.app.ux.features.scaffold

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.github.carlosquijano.androidjetpacktemplate.app.ui.features.navigation.NavRoutes
import io.github.carlosquijano.app.domain.model.UserContext
import io.github.carlosquijano.app.ui.R
import io.github.carlosquijano.app.ux.features.navigation.homeNavGraph

/**
 * Scaffold composable view.
 *
 * @param userContext The user context object
 * @param rootController The root controller object
 * @param mainController The main controller object
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldScreen(
    userContext: UserContext,
    rootController: NavHostController,
    mainController: NavHostController = rememberNavController(),
) {
    // In the next code line
    // Create a material3 scaffold layout object
    Scaffold(

        // In the next code line
        // Set the top bar attribute of the scaffold
        topBar = {
            ScaffoldTopBar(navController = mainController)
        },

        // In the next code line
        // Set the bottom bar attribute of the scaffold
        bottomBar = {
            BottomNavBar(navController = mainController)
        },
    ) {
        Column(
            Modifier
                .fillMaxSize()
                .padding(it),
        ) {
            MainNavigationGraph(
                userContext = userContext,
                rootController = rootController,
                mainController = mainController,
            )
        }
    }
}

@Composable
private fun MainNavigationGraph(
    userContext: UserContext,
    rootController: NavHostController,
    mainController: NavHostController,
) {
    // In the line above
    // we create the NavHost
    NavHost(
        route = NavRoutes.SCAFFOLD,
        navController = mainController,
        startDestination = NavRoutes.HOME,
    ) {
        // In the code line above
        // We construct the HOME navigation graph
        homeNavGraph(
            userContext = userContext,
            rootController = rootController,
            mainController = mainController,
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun ScaffoldTopBar(
    navController: NavController,
) {
    TopAppBar(
        title = {
            Text(
                stringResource(id = R.string.app_name),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
        },
        actions = {
            IconButton(
                onClick = {
                    navController.navigate(NavRoutes.NOTIFICATIONS) {
                        launchSingleTop = true
                    }
                },
            ) {
                Icon(
                    imageVector = Icons.Filled.Notifications,
                    contentDescription = "Localized description",
                )
            }
            IconButton(
                onClick = {
                    navController.navigate(NavRoutes.INBOX) {
                        launchSingleTop = true
                    }
                },
            ) {
                Icon(
                    imageVector = Icons.Filled.Email,
                    contentDescription = "Localized description",
                )
            }
        },
    )
}
