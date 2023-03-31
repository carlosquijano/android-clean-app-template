package io.github.cq.jetpackcompose.app.ux.features.login

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import io.github.cq.jetpackcompose.app.ui.R
import io.github.cq.jetpackcompose.app.ux.utils.TextLabelField

@Composable
fun UsernameField(
    value: String,
    onValueChange: (String) -> Unit,
) {
    TextLabelField(
        placeholder = stringResource(id = R.string.login_username_placeholder),
        value = value,
        onValueChange = onValueChange,
        keyboardOptions = KeyboardOptions(autoCorrect = false),
    )
}
