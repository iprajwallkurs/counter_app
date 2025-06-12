package com.example.countermvvm

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    val count = mutableStateOf(0)

    fun increment() {
        count.value++
    }

    fun decrement() {
        count.value--
    }
}
