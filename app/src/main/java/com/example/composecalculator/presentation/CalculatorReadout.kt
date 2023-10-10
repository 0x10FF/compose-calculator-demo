package com.example.composecalculator.presentation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CalculatorReadout(modifier: Modifier = Modifier) {
    Text(
        text = "Rebuilding calculator. There was a storage failure.",
        color = Color.White,
        modifier = modifier
    )
}

@Preview
@Composable
fun ReadoutPreview() {
    CalculatorReadout()
}