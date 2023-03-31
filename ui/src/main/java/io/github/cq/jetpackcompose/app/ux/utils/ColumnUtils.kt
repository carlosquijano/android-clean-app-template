package io.github.cq.jetpackcompose.app.ux.utils

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

internal const val paddingSeparator = 10

@Composable
fun FullWidthColumn(
    horizontalAlignment: Alignment.Horizontal = Alignment.CenterHorizontally,
    paddingValues: PaddingValues = PaddingValues(paddingSeparator.dp),
    body: @Composable ColumnScope.() -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(paddingValues = paddingValues),
        horizontalAlignment = horizontalAlignment,
        verticalArrangement = Arrangement.spacedBy(paddingSeparator.dp),
    ) {
        body()
    }
}

@Composable
fun FullWidthColumnCenter(
    paddingValues: PaddingValues = PaddingValues(paddingSeparator.dp),
    content: @Composable ColumnScope.() -> Unit,
) {
    Column(
        modifier = Modifier
            .padding(paddingValues = paddingValues)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        // In the code line above
        // Draw the content composable, if any
        content()
    }
}
