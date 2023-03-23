package io.github.carlosquijano.app.ux.features.login.screen

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.github.carlosquijano.androidjetpacktemplate.app.ui.utils.TextLabelField
import io.github.carlosquijano.app.ui.R

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
