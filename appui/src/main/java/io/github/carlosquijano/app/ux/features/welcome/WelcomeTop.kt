package io.github.carlosquijano.app.ux.features.welcome

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import io.github.carlosquijano.app.ui.R
import io.github.carlosquijano.app.ux.utils.CircleShapedCard
import io.github.carlosquijano.app.ux.utils.paddingSeparator

@Composable
fun WelcomeTop() {
    // In the next code line
    // Create a CircleBox wrapper
    CircleShapedCard(96.dp) {
        // In the next code line
        // Create a Image (full sized logo)
        Image(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingSeparator.dp),
            painter = painterResource(R.drawable.ic_launcher_app_foreground),
            contentDescription = stringResource(id = R.string.welcome),
            contentScale = ContentScale.Crop,
        )
    }
}
