package com.example.azkarapp.tasbehApp


import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class AzkarViewModel : ViewModel() {

    private val _counter = MutableStateFlow(0)
    val counter: StateFlow<Int> get() = _counter

    private val _textFieldValue = MutableStateFlow("")
    val textFieldValue: StateFlow<String> get() = _textFieldValue

    fun incrementCounter() {
        _counter.value += 1
    }

    fun updateTextFieldValue(newText: String) {
        _textFieldValue.value = newText
        _counter.value = 0 // Reset the counter when text changes
    }
}