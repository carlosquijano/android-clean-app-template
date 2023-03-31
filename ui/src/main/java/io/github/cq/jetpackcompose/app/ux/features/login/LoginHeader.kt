package io.github.cq.jetpackcompose.app.ux.features.login

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.cq.jetpackcompose.app.ux.utils.AppContainer

@Composable
fun LoginHeader(
    text: String,
    modifier: Modifier = Modifier,
    paddingValues: PaddingValues = PaddingValues(vertical = 20.dp),
    textAlign: TextAlign = TextAlign.Justify,
) {
    Box(
        modifier = Modifier.padding(paddingValues),
    ) {
        Text(
            modifier = modifier,
            text = text,
            textAlign = textAlign,
            style = MaterialTheme.typography.bodyLarge,
        )
    }
}

@Preview
@Composable
fun LoginHeaderPreview() {
    AppContainer {
        LoginHeader(
            text = "ead",
        )
    }
}
