package com.example.composecalculator.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composecalculator.R
import com.example.composecalculator.event.CalculatorAction
import com.example.composecalculator.event.CalculatorOperation
import com.example.composecalculator.presentation.theme.LightGrayColor
import com.example.composecalculator.presentation.theme.OrangeColor
import com.example.composecalculator.state.CalculatorState

@Composable
fun CalculatorScreen(
    state: CalculatorState,
    onActionHandler: (CalculatorAction) -> Unit = {}
) {

    val padding = 10.dp

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray)
            .padding(start = padding, top = padding * 2, end = padding, bottom = padding)
    ) {
        Box(
//            contentAlignment = Alignment.BottomEnd,
            modifier = Modifier.weight(1f)
                .fillMaxSize()
            ,
        ) {
            Text(
                text = state.number1 + (state.operation?.operator ?: "") + state.number2,
                color = Color.White,
                fontSize = 80.sp,
                lineHeight = 80.sp,
                modifier = Modifier
//                    .fillMaxSize()
                    .align(Alignment.BottomEnd)
                ,
                textAlign = TextAlign.End,
                )
        }
        Column() {
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp),

                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                CalculatorButton(
                    symbol = "C",
                    buttonColor = LightGrayColor,
                    modifier = Modifier
                        .weight(2f)
                        .defaultMinSize(minHeight = 80.dp),
                    onClick = {
                        onActionHandler(CalculatorAction.Clear)
                    }
                )
                CalculatorButton(
                    symbol = stringResource(id = R.string.delete),
                    buttonColor = LightGrayColor,
                    modifier = Modifier
                        .weight(1f)
                        .defaultMinSize(minHeight = 80.dp),
                    onClick = {
                        onActionHandler(CalculatorAction.Delete)
                    }
                )
                CalculatorButton(
                    symbol = stringResource(id = R.string.divide),
                    buttonColor = OrangeColor,
                    modifier = Modifier
                        .weight(1f)
                        .defaultMinSize(minHeight = 80.dp),
                    onClick = {
                        onActionHandler(
                            CalculatorAction.Operation(CalculatorOperation.Divide)
                        )
                    }
                )
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp),

                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                CalculatorButton(
                    symbol = "7",
                    modifier = Modifier
                        .weight(1f)
                        .defaultMinSize(minHeight = 80.dp),
                    onClick = {
                        onActionHandler(
                            CalculatorAction.Number(7)
                        )
                    }
                )
                CalculatorButton(
                    symbol = "8",
                    modifier = Modifier
                        .weight(1f)
                        .defaultMinSize(minHeight = 80.dp),
                    onClick = {
                        onActionHandler(
                            CalculatorAction.Number(8)
                        )
                    }
                )
                CalculatorButton(
                    symbol = "9",
                    modifier = Modifier
                        .weight(1f)
                        .defaultMinSize(minHeight = 80.dp),
                    onClick = {
                        onActionHandler(
                            CalculatorAction.Number(9)
                        )
                    }
                )
                CalculatorButton(
                    symbol = stringResource(id = R.string.multiply),
                    buttonColor = OrangeColor,
                    modifier = Modifier
                        .weight(1f)
                        .defaultMinSize(minHeight = 80.dp),
                    onClick = {
                        onActionHandler(
                            CalculatorAction.Operation(CalculatorOperation.Times)
                        )
                    }
                )
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp),

                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                CalculatorButton(
                    symbol = "4",
                    modifier = Modifier
                        .weight(1f)
                        .defaultMinSize(minHeight = 80.dp),
                    onClick = {
                        onActionHandler(
                            CalculatorAction.Number(4)
                        )
                    }
                )
                CalculatorButton(
                    symbol = "5",
                    modifier = Modifier
                        .weight(1f)
                        .defaultMinSize(minHeight = 80.dp),
                    onClick = {
                        onActionHandler(
                            CalculatorAction.Number(5)
                        )
                    }
                )
                CalculatorButton(
                    symbol = "6",
                    modifier = Modifier
                        .weight(1f)
                        .defaultMinSize(minHeight = 80.dp),
                    onClick = {
                        onActionHandler(
                            CalculatorAction.Number(6)
                        )
                    }
                )
                CalculatorButton(
                    symbol = "-",
                    buttonColor = OrangeColor,
                    modifier = Modifier
                        .weight(1f)
                        .defaultMinSize(minHeight = 80.dp),
                    onClick = {
                        onActionHandler(
                            CalculatorAction.Operation(CalculatorOperation.Minus)
                        )
                    }
                )
            }

            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp),

                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                CalculatorButton(
                    symbol = "1",
                    modifier = Modifier
                        .weight(1f)
                        .defaultMinSize(minHeight = 80.dp),
                    onClick = {
                        onActionHandler(
                            CalculatorAction.Number(1)
                        )
                    }
                )
                CalculatorButton(
                    symbol = "2",
                    modifier = Modifier
                        .weight(1f)
                        .defaultMinSize(minHeight = 80.dp),
                    onClick = {
                        onActionHandler(
                            CalculatorAction.Number(2)
                        )
                    }
                )
                CalculatorButton(
                    symbol = "3",
                    modifier = Modifier
                        .weight(1f)
                        .defaultMinSize(minHeight = 80.dp),
                    onClick = {
                        onActionHandler(
                            CalculatorAction.Number(3)
                        )
                    }
                )
                CalculatorButton(
                    symbol = "+",
                    buttonColor = OrangeColor,
                    modifier = Modifier
                        .weight(1f)
                        .defaultMinSize(minHeight = 80.dp),
                    onClick = {
                        onActionHandler(
                            CalculatorAction.Operation(CalculatorOperation.Plus)
                        )
                    }
                )
            }

            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp),

                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                CalculatorButton(
                    symbol = "0",
                    modifier = Modifier
                        .weight(2f)
                        .defaultMinSize(minHeight = 80.dp),
                    onClick = {
                        onActionHandler(
                            CalculatorAction.Number(0)
                        )
                    }
                )
                CalculatorButton(
                    symbol = ".",
                    modifier = Modifier
                        .weight(1f)
                        .defaultMinSize(minHeight = 80.dp),
                    onClick = {
                        onActionHandler(
                            CalculatorAction.Decimal
                        )
                    }
                )
                CalculatorButton(
                    symbol = "=",
                    buttonColor = OrangeColor,
                    modifier = Modifier
                        .weight(1f)
                        .defaultMinSize(minHeight = 80.dp),
                    onClick = {
                        onActionHandler(
                            CalculatorAction.Calculate
                        )
                    }

                )
            }

        }

    }

}



@Preview(widthDp = 800, heightDp = 1400, name = "Sample Android Phone")
@Composable
fun CalculatorPreview() {
    CalculatorScreen(
        state = CalculatorState("100")
    )
}

@Preview(widthDp = 800, heightDp = 1400, name = "Sample Android Phone")
@Composable
fun CalculatorScreenWithLargeEntry() {
    CalculatorScreen(
        state = CalculatorState("100000000000000000000000000000000000000000000000000000000")
    )
}