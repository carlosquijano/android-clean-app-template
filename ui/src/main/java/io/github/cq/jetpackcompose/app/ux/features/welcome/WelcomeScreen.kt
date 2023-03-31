package io.github.cq.jetpackcompose.app.ux.features.welcome

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.cq.jetpackcompose.app.ui.R
import io.github.cq.jetpackcompose.app.ux.features.blank.BlankScreen
import io.github.cq.jetpackcompose.app.ux.utils.AppContainer
import io.github.cq.jetpackcompose.app.ux.utils.ButtonMedium

/**
 * Welcome composable screen.
 *
 * @param title Screen title
 * @param labelLogin login button text
 * @param labelSignup signup button text
 * @param onClickLogin Callback that is executed when users click the login text
 * @param onClickSignup Callback that is executed when users click the signup text
 */
@Composable
fun WelcomeScreen(
    title: String,
    labelLogin: String,
    labelSignup: String,
    onClickLogin: () -> Unit,
    onClickSignup: () -> Unit,
) {
    // In the next code line
    // We specify a BlankScreen composable
    BlankScreen(
        title = title,
        top = {
            WelcomeTop(
                imageResource = painterResource(R.drawable.ic_launcher_app_foreground),
                contentDescription = stringResource(id = R.string.welcome),
            )
        },
        bottom = {
            WelcomeBottom(
                titleLarge = stringResource(id = R.string.app_name),
                titleSmall = stringResource(id = R.string.welcome_footer),
            )
        },
    ) {
        Row(
            modifier = Modifier.padding(vertical = 10.dp),
            horizontalArrangement = Arrangement.spacedBy(10.dp),
        ) {
            ButtonMedium(
                text = labelLogin,
                onClick = onClickLogin,
            )
            ButtonMedium(
                text = labelSignup,
                onClick = onClickSignup,
            )
        }
    }
}

@Preview
@Composable
fun WelcomePreview() {
    AppContainer {
        WelcomeScreen(
            title = stringResource(id = R.string.welcome).lowercase(),
            labelLogin = stringResource(id = R.string.login_label),
            labelSignup = stringResource(id = R.string.signup_label),
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
            labelLogin = stringResource(id = R.string.login_label),
            labelSignup = stringResource(id = R.string.signup_label),
            onClickLogin = { },
            onClickSignup = { },
        )
    }
}
