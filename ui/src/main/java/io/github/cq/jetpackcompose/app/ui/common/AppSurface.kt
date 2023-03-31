package io.github.cq.jetpackcompose.app.ui.common

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import io.github.cq.jetpackcompose.app.ui.theme.JetpackComposeAppTemplateTheme

/**
 * A full-sized surface container using the 'background' color from the theme color scheme.
 */
@Composable
fun AppSurface(
    modifier: Modifier = Modifier,
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    // In the next code line
    // Create a themed container of type JetpackComposeAppTemplateTheme
    JetpackComposeAppTemplateTheme(

        // In the next code line
        // We specify dark mode in the theme
        // by passing the value of the darkTheme parameter
        darkTheme = darkTheme,
    ) {
        // In the next code line
        // Create a full-size surface container
        Surface(
            modifier = modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background,
        ) {
            // In the next code line
            // Call the content block
            content()
        }
    }
}

@Preview
@Composable
fun AppSurfacePreview() {
    AppSurface {
        Greeting(name = "Android")
    }
}
