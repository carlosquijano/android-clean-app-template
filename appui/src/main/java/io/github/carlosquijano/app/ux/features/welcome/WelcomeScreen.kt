package io.github.carlosquijano.app.ux.features.welcome

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.carlosquijano.app.ui.R
import io.github.carlosquijano.app.ux.features.blank.BlankScreen
import io.github.carlosquijano.app.ux.utils.AppContainer

/**
 * Welcome composable screen.
 *
 * @param title Screen title
 * @param onClickLogin Callback that is executed when users click the login text
 * @param onClickSignup Callback that is executed when users click the signup text
 */
@Composable
fun WelcomeScreen(
    title: String,
    onClickLogin: () -> Unit,
    onClickSignup: () -> Unit,
) {
    // In the next code line
    // Create BlankScreen composable
    BlankScreen(
        name = title,
        top = {
            WelcomeTop()
        },
        bottom = {
            WelcomeBottom()
        },
    ) {
        Row(
            modifier = Modifier.padding(vertical = 10.dp),
            horizontalArrangement = Arrangement.spacedBy(10.dp),
        ) {
            LoginButton(text = stringResource(id = R.string.login_label), onClickLogin)
            LoginButton(text = stringResource(id = R.string.signup_label), onClickSignup)
        }
    }
}

@Composable
private fun LoginButton(text: String, onClick: () -> Unit) {
    Button(
        modifier = Modifier.width(150.dp),
        onClick = onClick,
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.titleMedium,
        )
    }
}

@Preview
@Composable
fun WelcomePreview() {
    AppContainer {
        WelcomeScreen(
            title = stringResource(id = R.string.welcome).lowercase(),
            onClickLogin = { },
            onClickSignup = { },
        )
    }
}

@Preview
@Composable
fun WelcomePreviewDark() {
    AppContainer(darkTheme = true) {
        WelcomeScreen(
            title = stringResource(id = R.string.welcome).lowercase(),
            onClickLogin = { },
            onClickSignup = { },
        )
    }
}
