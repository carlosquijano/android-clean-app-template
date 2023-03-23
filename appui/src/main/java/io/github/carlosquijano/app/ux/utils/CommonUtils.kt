package io.github.carlosquijano.app.ux.utils

import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.carlosquijano.app.ui.theme.JetpackComposeAppTemplateTheme

@Composable
fun AppContainer(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    // In the next code line
    // A theme container is created
    JetpackComposeAppTemplateTheme(darkTheme) {
        // In the next code line
        // A Surface is created
        Surface(

            // In the next code line
            // Make the Surface fill the max size
            Modifier.fillMaxSize(),
        ) {
            // In the next code line
            // Compose the content
            content()
        }
    }
}

@Composable
fun CircleShapedCard(
    size: Dp,
    elevation: Dp = 2.dp,
    content: @Composable ColumnScope.() -> Unit,
) {
    Card(
        Modifier.size(size),
        shape = CircleShape,
        elevation = CardDefaults.cardElevation(
            defaultElevation = elevation,
        ),
    ) {
        content()
    }
}

@Composable
fun TextBoxed(
    modifier: Modifier = Modifier,
    style: TextStyle = MaterialTheme.typography.labelMedium,
    text: String,
) {
    Box(
        // In the next code line
        // We set the attributes for an alpha blended bottom aligned box
        modifier,
    ) {
        // In the next code line
        // We specify the welcome message text
        Text(
            text = text,
            style = style,
            color = Color.Gray,
        )
    }
}

@Composable
fun TextLink(
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit,
) {
    Text(
        text = text,
        modifier = modifier.clickable { onClick() },
        style = MaterialTheme.typography.bodyLarge,
        color = MaterialTheme.colorScheme.primary,
    )
}
