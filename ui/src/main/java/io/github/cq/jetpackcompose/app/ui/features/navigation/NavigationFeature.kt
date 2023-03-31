package io.github.cq.jetpackcompose.app.ui.features.navigation

import androidx.compose.runtime.Composable
import io.github.cq.jetpackcompose.app.ux.features.UIFeature
import io.github.cq.jetpackcompose.app.ux.features.navigation.nested.NestedNavigationGraph

class NavigationFeature(
    private val isLoginEnabled: Boolean = true,
) : UIFeature {
    @Composable
    override fun TryFeature() {
        // In the next code line
        // We specify a nested navigation graph
        NestedNavigationGraph()
    }
}
