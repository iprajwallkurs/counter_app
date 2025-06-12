package com.example.countermvvm

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.countermvvm.ui.theme.CounterMVVMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent{
            CounterMVVMTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding -> }
                TheCounterApp()
            }
        }
    }
}

@Composable

fun TheCounterApp(){
    val count = remember { mutableStateOf(0) }

    fun increment(){
        count.value++
    }
    fun decrement(){
        count.value--
    }
    Column (modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally)
    {
        Text(text = "Count : ${count.value}",
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold
            )
        Spacer(modifier = Modifier.height(16.dp))
        Row{
            Button(onClick = {increment()}) {
                Text("Increment")
            }
            Button(onClick = {decrement()}) {
                Text("Decrement")
            }
        }
    }
}