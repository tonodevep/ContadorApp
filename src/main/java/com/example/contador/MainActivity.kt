package com.example.contador

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Contador()
        }
    }
}

@Composable
fun Contador() {
    var contador by remember { mutableIntStateOf(0) }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Contador: $contador", fontSize = 32.sp)

        if (contador >= 10) {
            Text(text = "¡Meta Conseguida por Toño :)!", fontSize = 24.sp)
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row {
            Button(onClick = { contador-- }, modifier = Modifier.padding(8.dp)) {
                Text("−")
            }
            Button(onClick = { contador++ }, modifier = Modifier.padding(8.dp)) {
                Text("+")
            }
            Button(onClick = { contador = 0 }, modifier = Modifier.padding(8.dp)) {
                Text("Reset")
            }
        }
    }
}
