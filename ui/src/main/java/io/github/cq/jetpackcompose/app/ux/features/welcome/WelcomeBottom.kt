package io.github.cq.jetpackcompose.app.ux.features.welcome

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import io.github.cq.jetpackcompose.app.ux.utils.TextBoxed

/**
 * Bottom of the welcome screen.
 */
@Composable
fun WelcomeBottom(
    titleLarge: String,
    titleSmall: String,
) {
    TextBoxed(
        Modifier
            .height(100.dp)
            .alpha(0.7f)
            .wrapContentHeight(Alignment.Bottom),
        text = titleLarge,
        style = MaterialTheme.typography.labelLarge.copy(
            fontWeight = FontWeight.Bold,
        ),
    )

    // In the next code line
    // We specify the "made with" text
    TextBoxed(
        Modifier
            .alpha(0.7f),
        text = titleSmall,
    )
}
