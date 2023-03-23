package io.github.carlosquijano.app.ux.features.login.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.carlosquijano.app.ui.R
import io.github.carlosquijano.app.ux.utils.AppContainer

@Composable
fun LoginHeader(
    modifier: Modifier = Modifier,
    paddingValues: PaddingValues = PaddingValues(vertical = 20.dp),
    textAlign: TextAlign = TextAlign.Justify,
) {
    Box(
        modifier = Modifier.padding(paddingValues),
    ) {
        Text(
            modifier = modifier,
            text = stringResource(id = R.string.login_header_body),
            textAlign = textAlign,
            style = MaterialTheme.typography.bodyLarge,
        )
    }
}

@Preview
@Composable
fun LoginHeaderPreview() {
    AppContainer {
        LoginHeader()
    }
}
