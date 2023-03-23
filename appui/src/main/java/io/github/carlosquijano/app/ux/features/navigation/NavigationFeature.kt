package io.github.carlosquijano.app.ux.features.navigation

import androidx.compose.runtime.Composable
import io.github.carlosquijano.app.ux.features.UIFeature

class NavigationFeature(
    private val isLoginEnabled: Boolean = true,
) : UIFeature {
    @Composable
    override fun TryFeature() {
        NestedNavigationGraph()
    }
}
