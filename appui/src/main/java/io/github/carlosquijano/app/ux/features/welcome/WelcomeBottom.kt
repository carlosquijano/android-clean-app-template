package io.github.carlosquijano.app.ux.features.welcome

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import io.github.carlosquijano.app.ui.R
import io.github.carlosquijano.app.ux.utils.TextBoxed

/**
 * Bottom of the welcome screen.
 */
@Composable
fun WelcomeBottom() {
    TextBoxed(
        Modifier
            .height(100.dp)
            .alpha(0.7f)
            .wrapContentHeight(Alignment.Bottom),
        text = stringResource(id = R.string.app_name),
        style = MaterialTheme.typography.labelLarge.copy(
            fontWeight = FontWeight.Bold,
        ),
    )

    // In the next code line
    // We specify the "made with" text
    TextBoxed(
        Modifier
            .alpha(0.7f),
        text = stringResource(id = R.string.welcome_footer),
    )
}
