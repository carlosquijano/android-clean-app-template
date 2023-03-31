package io.github.cq.jetpackcompose.app.ux.features.welcome

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import io.github.cq.jetpackcompose.app.ux.utils.CircleShapedCard
import io.github.cq.jetpackcompose.app.ux.utils.paddingSeparator

@Composable
fun WelcomeTop(
    imageResource: Painter,
    contentDescription: String,
) {
    // In the next code line
    // Create a CircleBox wrapper
    CircleShapedCard(96.dp) {
        // In the next code line
        // Create a Image (full sized logo)
        Image(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingSeparator.dp),
            painter = imageResource,
            contentDescription = contentDescription,
            contentScale = ContentScale.Crop,
        )
    }
}
