package io.github.carlosquijano.app.ux.features.login.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Login
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import io.github.carlosquijano.app.ui.R
import io.github.carlosquijano.app.ux.utils.TextLink

@Composable
fun LoginSubmit(
    text: String,
    textStyle: TextStyle = MaterialTheme.typography.bodyLarge,
    onSignupClick: () -> Unit,
    enabled: Boolean = true,
    onClick: () -> Unit,
) {
    Button(
        onClick = onClick,
        enabled = enabled,
        modifier = Modifier.fillMaxWidth(),
    ) {
        Icon(
            imageVector = Icons.Filled.Login,
            contentDescription = "Login",
        )
        Spacer(Modifier.width(10.dp))
        Text(
            text = text,
            style = textStyle.copy(fontWeight = FontWeight.Bold),
        )
    }
    SignupTextAndLink(onSignupClick)
}

@Composable
private fun SignupTextAndLink(
    onSignupClick: () -> Unit,
) {
    Row(
        modifier = Modifier.padding(top = 10.dp, bottom = 25.dp),
        horizontalArrangement = Arrangement.spacedBy(5.dp),
    ) {
        Text(
            text = stringResource(R.string.login_dont_have_account_label),
            style = MaterialTheme.typography.bodyLarge,
        )
        TextLink(
            onClick = onSignupClick,
            text = stringResource(R.string.login_signup_label),
        )
    }
}
