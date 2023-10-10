package com.example.composecalculator.event

sealed class CalculatorOperation(val operator: String) {
    object Plus: CalculatorOperation("+")
    object Minus: CalculatorOperation("-")
    object Times: CalculatorOperation("*")
    object Divide: CalculatorOperation("/")
}