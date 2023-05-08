package io.github.carlosquijano.appx.ui.design.scaffold

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController

@Composable
fun ScaffoldView() {
    Scaffold {
        Column(
            Modifier.padding(it)
        ) {
            ScaffoldNavHost(
                navController = rememberNavController()
            )
        }
    }
}

@Preview
@Composable
fun ScaffoldViewPreview() {
    ScaffoldView()
}