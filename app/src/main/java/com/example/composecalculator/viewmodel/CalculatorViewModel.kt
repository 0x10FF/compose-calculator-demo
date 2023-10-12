package com.example.composecalculator.viewmodel

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.composecalculator.event.CalculatorAction
import com.example.composecalculator.event.CalculatorOperation
import com.example.composecalculator.state.CalculatorState

class CalculatorViewModel(
    val savedStateHandle: SavedStateHandle
) : ViewModel() {


    private val TAG: String? = CalculatorViewModel::class.java.simpleName
    var state by mutableStateOf(CalculatorState())
        private set

    @Suppress("unused")
    fun onActionHandler(action: CalculatorAction) {
        Log.d(TAG, "action entered $action")

        when(action) {
            CalculatorAction.Calculate -> {
                val dateValid = state.number1 != ""
                        && state.operation != null
                        && state.number2 != ""

                if (dateValid) {
                    val divideByZeroError = state.number2.toInt() == 0
                    if (!divideByZeroError) {
                        calculate()
                    } else {
                        state = CalculatorState(number1 = "Error")
                    }
                }
            }
            CalculatorAction.Clear -> state = CalculatorState()
            CalculatorAction.Decimal -> handleDecimal()
            CalculatorAction.Delete -> handleDelete()
            is CalculatorAction.Number -> {
                handleNumber(action.number)


            }
            is CalculatorAction.Operation -> {
                if (state.number1 != "") {
                    state = state.copy(operation = action.operation)
                }
            }
        }
    }

    private fun calculate() {
        state.number2.let {
            when(state.operation) {
                CalculatorOperation.Divide -> {
                    state = CalculatorState(
                        number1 = state.number1.toInt()
                            .div(state.number2.toInt())
                            .toString()
                    )
                }
                CalculatorOperation.Minus -> {
                state = CalculatorState(
                    number1 = state.number1.toInt()
                        .minus(state.number2.toInt())
                        .toString()
                )
            }
                CalculatorOperation.Times -> {
                    state = CalculatorState(
                        number1 = state.number1.toInt()
                            .times(state.number2.toInt())
                            .toString()
                    )
                }
                CalculatorOperation.Plus -> {
                    state = CalculatorState(
                        number1 = state.number1.toInt()
                            .plus(state.number2.toInt())
                            .toString()
                    )
                }
                else -> {
                    Log.d(TAG, "State is $state")
                }
            }
        }
    }

    private fun whichNumberToOperateOn() : Int {
        return if (this.state.operation == null) 1 else 2
    }
    private fun handleDelete() {
        when (whichNumberToOperateOn()) {
            1 -> { state = state.copy(number1 = state.number1.dropLast(1)) }
            2 -> { state = state.copy(number2 = state.number2.dropLast(1)) }
        }
    }
    private fun handleDecimal() {
        when (whichNumberToOperateOn()) {
            1 -> { state = state.copy(number1 = state.number1 + ".") }
            2 -> { state = state.copy(number2 = state.number2 + ".") }
        }
    }

    private fun handleNumber(enteredNumber: Int) {
        when (whichNumberToOperateOn()) {
            1 -> { state = state.copy(number1 = state.number1 + enteredNumber.toString()) }
            2 -> { state = state.copy(number2 = state.number2 + enteredNumber.toString()) }
        }
    }


}


