package com.example.composecalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.core.view.WindowCompat
import com.example.composecalculator.presentation.CalculatorScreen
import com.example.composecalculator.presentation.theme.ComposeCalculatorTheme
import com.example.composecalculator.viewmodel.CalculatorViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // display edge-to-edge
        // https://developer.android.com/develop/ui/views/layout/edge-to-edge
        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            ComposeCalculatorTheme {

                val viewModel = viewModels<CalculatorViewModel>()

                CalculatorScreen(
                    state = viewModel.value.state,
                    onActionHandler = viewModel.value::onActionHandler
                )
            }
        }
    }
}