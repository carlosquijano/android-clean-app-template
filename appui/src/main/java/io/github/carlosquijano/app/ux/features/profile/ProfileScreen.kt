package io.github.carlosquijano.app.ux.features.profile

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Logout
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.carlosquijano.app.ui.R
import io.github.carlosquijano.app.ux.utils.AppContainer
import io.github.carlosquijano.app.ux.utils.CircleShapedCard
import io.github.carlosquijano.app.ux.utils.FullWidthColumn
import io.github.carlosquijano.app.ux.utils.paddingSeparator

/**
 * Profile composable screen.
 *
 * @param username The username for the profile screen.
 * @param onClickLogout Callback when user click the logout button.
 */
@Composable
fun ProfileScreen(
    username: String,
    onClickLogout: () -> Unit = {},
) {
    FullWidthColumn {
        ProfileHeader(username = username)
        Divider()
        Spacer(modifier = Modifier.weight(1f))
        ProfileLinks(
            onClickLogout = onClickLogout,
        )
    }
}

@Composable
private fun ProfileLinks(
    onClickLogout: () -> Unit = {},
) {
    LogoutButton(
        onClick = onClickLogout,
        text = stringResource(id = R.string.logout_label),
    )
}

@Composable
private fun ProfileHeader(username: String) {
    CircleShapedCard(
        size = 96.dp,
    ) {
        Icon(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingSeparator.dp),
            imageVector = Icons.Outlined.Person,
            contentDescription = "Username",
        )
    }

    Text(
        text = username,
        style = MaterialTheme.typography.displaySmall.copy(
            fontWeight = FontWeight.Bold,
        ),
    )
}

@Composable
private fun LogoutButton(text: String, onClick: () -> Unit) {
    OutlinedButton(
        onClick = onClick,
    ) {
        Icon(
            imageVector = Icons.Filled.Logout,
            contentDescription = "Logout",
        )
        Text(text = text)
    }
}

@Preview
@Composable
private fun ProfileScreenPreview() {
    AppContainer {
        ProfileScreen(
            username = "CQ",
        )
    }
}

@Preview
@Composable
private fun ProfileScreenPreviewDark() {
    AppContainer(darkTheme = true) {
        ProfileScreen(
            username = "CQ",
        )
    }
}
