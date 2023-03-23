package com.github.carlosquijano.androidjetpacktemplate.app.ui.utils

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.VisualTransformation

/**
 * Composable for the majority of TextFields of the App.
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextLabelField(
    label: String? = null,
    placeholder: String,
    value: String,
    labelTextStyle: TextStyle = MaterialTheme.typography.labelMedium,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    trailingIcon: @Composable (() -> Unit)? = null,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    onValueChange: (String) -> Unit,
) {
    if (label != null) {
        Text(
            text = label,
            style = labelTextStyle.copy(fontWeight = FontWeight.Bold),
            color = Color.Gray.copy(alpha = 0.5f),
        )
    }
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(placeholder) },
        modifier = Modifier.fillMaxWidth(),
        keyboardOptions = keyboardOptions,
        visualTransformation = visualTransformation,
        trailingIcon = trailingIcon,
    )
}
