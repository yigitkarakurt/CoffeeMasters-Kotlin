@file:OptIn(ExperimentalMaterial3Api::class)

package com.yigitkarakurt.coffeemasters

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yigitkarakurt.coffeemasters.ui.theme.CoffeeMastersTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CoffeeMastersTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Text(text = "Hello World")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FirstComposable() {

    var name = remember { mutableStateOf("") }

    Column() {
        Text( "Hello ${name.value}",
            modifier = Modifier
                .padding(16.dp)
                .background(Color.Yellow)
                .padding()
        )
        TextField(value = name.value, onValueChange = {
            name.value = it
        } )
    }
}