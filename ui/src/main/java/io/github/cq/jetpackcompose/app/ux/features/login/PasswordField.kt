package io.github.cq.jetpackcompose.app.ux.features.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import io.github.cq.jetpackcompose.app.ui.R
import io.github.cq.jetpackcompose.app.ux.utils.TextLabelField
import io.github.cq.jetpackcompose.app.ux.utils.TextLink

@Composable
fun PasswordField(
    value: String,
    onForgotClick: () -> Unit,
    onValueChange: (String) -> Unit,
) {
    var passwordVisible by remember { mutableStateOf(false) }
    TextLabelField(
        placeholder = stringResource(id = R.string.login_password_placeholder),
        value = value,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
        onValueChange = onValueChange,
        trailingIcon = {
            val image = if (passwordVisible) {
                Icons.Filled.Visibility
            } else {
                Icons.Filled.VisibilityOff
            }

            val description = if (passwordVisible) {
                "Hide password"
            } else {
                "Show password"
            }

            IconButton(onClick = { passwordVisible = !passwordVisible }) {
                Icon(imageVector = image, description)
            }
        },
    )
    ForgotPasswordTextAndLink(onForgotClick)
}

@Composable
private fun ForgotPasswordTextAndLink(
    onClick: () -> Unit,
) {
    Row(
        modifier = Modifier.padding(top = 10.dp, bottom = 25.dp),
        horizontalArrangement = Arrangement.spacedBy(5.dp),
    ) {
        Text(
            text = stringResource(R.string.login_forgot_label),
            style = MaterialTheme.typography.bodyLarge,
        )
        TextLink(
            onClick = onClick,
            text = stringResource(R.string.login_remember_label),
        )
    }
}
