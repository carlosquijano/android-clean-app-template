package io.github.carlosquijano.app.ux.common

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import io.github.carlosquijano.app.ui.theme.JetpackComposeAppTemplateTheme

/**
 * A full-sized surface container using the 'background' color from the theme color scheme.
 */
@Composable
fun AppSurface(
    modifier: Modifier = Modifier,
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    JetpackComposeAppTemplateTheme(
        darkTheme = darkTheme,
    ) {
        Surface(
            modifier = modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background,
        ) {
            content()
        }
    }
}
