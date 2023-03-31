package io.github.cq.jetpackcompose.app.ui.common

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview

/**
 * A greeting composable.
 */
@Composable
fun Greeting(
    modifier: Modifier = Modifier,
    textAlign: TextAlign = TextAlign.Start,
    textStyle: TextStyle = MaterialTheme.typography.bodyLarge,
    name: String,
) {
    Text(
        modifier = modifier,
        textAlign = textAlign,
        style = textStyle,
        text = "\uD83D\uDC4B Hello $name!",
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppSurface {
        Greeting(
            Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            name = "Android",
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreviewDark() {
    AppSurface(darkTheme = true) {
        Greeting(
            Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            name = "Android",
        )
    }
}
