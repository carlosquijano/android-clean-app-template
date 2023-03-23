package io.github.carlosquijano.app.ux.features.login.screen

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import io.github.carlosquijano.app.ui.R
import io.github.carlosquijano.app.ux.features.blank.BlankScreen
import io.github.carlosquijano.app.ux.features.welcome.WelcomeTop
import io.github.carlosquijano.app.ux.utils.AppContainer

@Composable
fun LoginScreen(
    username: String,
    password: String,
    isSubmitEnabled: Boolean,
    onUsernameChange: (String) -> Unit,
    onPasswordChange: (String) -> Unit,
    onForgotClick: () -> Unit,
    onSignup: () -> Unit,
    onSubmit: () -> Unit,
) {
    BlankScreen(
        name = stringResource(id = R.string.login_header_label),
        top = {
            WelcomeTop()
        },
        header = {
            LoginHeader()
        },
        bottom = {
            LoginSubmit(
                text = stringResource(R.string.login_submit_label),
                onClick = onSubmit,
                enabled = isSubmitEnabled,
                onSignupClick = onSignup,
            )
        },
    ) {
        // Username
        UsernameField(
            value = username,
            onValueChange = onUsernameChange,
        )

        // Password
        PasswordField(
            value = password,
            onValueChange = onPasswordChange,
            onForgotClick = onForgotClick,
        )
    }
}

@Preview
@Composable
fun LoginScreenPreview() {
    AppContainer {
        LoginScreen(
            username = "cq",
            password = "cq",
            isSubmitEnabled = true,
            onUsernameChange = {},
            onPasswordChange = {},
            onForgotClick = {},
            onSignup = {},
            onSubmit = {},
        )
    }
}

@Preview
@Composable
fun LoginScreenPreviewDark() {
    AppContainer(darkTheme = true) {
        LoginScreen(
            username = "cq",
            password = "cq",
            isSubmitEnabled = true,
            onUsernameChange = {},
            onPasswordChange = {},
            onForgotClick = {},
            onSignup = {},
            onSubmit = {},
        )
    }
}
