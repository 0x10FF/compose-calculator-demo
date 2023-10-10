package com.example.composecalculator.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composecalculator.R
import com.example.composecalculator.presentation.theme.LightGrayColor
import com.example.composecalculator.presentation.theme.OrangeColor

@Composable
fun CalculatorButton(
    symbol: String,
    modifier: Modifier = Modifier,
    buttonColor: Color = Color.DarkGray,
    fontSize: TextUnit = 40.sp,
    onClick: () -> Unit = {}
) {
    Box(
        contentAlignment = Center,
        modifier = modifier
            .clip(CircleShape)
            .background(buttonColor)
            .clickable { onClick() }
            .then(modifier)
        ) {
            Text(
                text = symbol,
                color = Color.White,
                fontSize = fontSize,
                textAlign = TextAlign.Center
            )
    }
}

@Preview
@Composable
fun Number() {
    CalculatorButton(
        symbol = "7",
        modifier = Modifier
            .width(120.dp)
            .height(120.dp)
    )
}

@Preview
@Composable
fun Divide() {
    CalculatorButton(
        symbol = stringResource(id = R.string.divide),
        buttonColor = OrangeColor,
        modifier = Modifier
            .width(120.dp)
            .height(120.dp)
    )
}

@Preview
@Composable
fun Multiply() {
    CalculatorButton(
        symbol = stringResource(id = R.string.multiply),
        buttonColor = OrangeColor,
        modifier = Modifier
            .width(120.dp)
            .height(120.dp)
    )
}

@Preview
@Composable
fun Function() {
    CalculatorButton(
        symbol = "+",
        buttonColor = LightGrayColor,
        modifier = Modifier
            .width(120.dp)
            .height(120.dp)
    )
}

@Preview(widthDp = 600)
@Composable
fun RowOfButtons() {
    Column {
        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            CalculatorButton(
                symbol = "7",
                modifier = Modifier
                    .width(120.dp)
                    .height(120.dp)
            )

            CalculatorButton(
                symbol = "8",
                modifier = Modifier
                    .width(120.dp)
                    .height(120.dp)
            )
            CalculatorButton(
                symbol = "9",
                modifier = Modifier
                    .width(120.dp)
                    .height(120.dp)
            )
            CalculatorButton(
                symbol = stringResource(id = R.string.multiply),
                buttonColor = OrangeColor,
                modifier = Modifier
                    .width(120.dp)
                    .height(120.dp)
            )
        }
    }

}

@Preview(widthDp = 800)
@Composable
fun LargerScreenButtonRow() {
    Column {
        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            CalculatorButton(
                symbol = "7",
                modifier = Modifier
                    .width(120.dp)
                    .height(120.dp)
            )

            CalculatorButton(
                symbol = "8",
                modifier = Modifier
                    .width(120.dp)
                    .height(120.dp)
            )
            CalculatorButton(
                symbol = "9",
                modifier = Modifier
                    .width(120.dp)
                    .height(120.dp)
            )
            CalculatorButton(
                symbol = stringResource(id = R.string.multiply),
                buttonColor = OrangeColor,
                modifier = Modifier
                    .width(120.dp)
                    .height(120.dp)
            )
        }
    }

}

@Preview(widthDp = 300)
@Composable
fun LimitedSpaceScreenButtonRow() {
    Column {
        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            CalculatorButton(
                symbol = "7",
                modifier = Modifier
                    .weight(1f)
            )

            CalculatorButton(
                symbol = "8",
                modifier = Modifier
                    .weight(1f)
            )
            CalculatorButton(
                symbol = "9",
                modifier = Modifier
                    .weight(1f)
            )
            CalculatorButton(
                symbol = stringResource(id = R.string.multiply),
                buttonColor = OrangeColor,
                modifier = Modifier
                    .weight(1f)
            )
        }
    }

}

@Preview(widthDp = 600)
@Composable
fun ButtonRowWithLargerButton() {
    Column {
        Row(modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            CalculatorButton(
                symbol = "C",
                buttonColor = LightGrayColor,
                modifier = Modifier
                    .weight(2f)
            )

            CalculatorButton(
                symbol = stringResource(id = R.string.delete),
                buttonColor = LightGrayColor,
                modifier = Modifier
                    .width(120.dp)
                    .height(120.dp)
            )
            CalculatorButton(
                symbol = "9",
                modifier = Modifier
                    .width(120.dp)
                    .height(120.dp)

            )

        }
    }

}
