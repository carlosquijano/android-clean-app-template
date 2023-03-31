package io.github.cq.jetpackcompose.app.ux.features.blank

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import io.github.cq.jetpackcompose.app.ux.utils.FullWidthColumnCenter

@Composable
fun BlankScreen(
    title: String,
    paddingValues: PaddingValues = PaddingValues(20.dp),
    textStyle: TextStyle = MaterialTheme.typography.displayMedium,
    onClick: () -> Unit = {},
    top: @Composable ColumnScope.() -> Unit = {},
    header: @Composable ColumnScope.() -> Unit = {},
    bottom: @Composable ColumnScope.() -> Unit = {},
    body: @Composable ColumnScope.() -> Unit = {},
) {
    // In the next code line
    // Create a full sized centered column
    FullWidthColumnCenter(paddingValues = paddingValues) {
        // In the next code line
        // draw top
        top()

        Text(
            modifier = Modifier.clickable { onClick() },
            text = title,
            style = textStyle,
            color = Color.Gray,
            textAlign = TextAlign.Center,
        )

        header()

        // In the next code line
        // draw body
        body()

        // In the next code line
        // draw foot
        bottom()
    }
}
