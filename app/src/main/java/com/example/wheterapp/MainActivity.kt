package com.example.wheterapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.rememberNavController
import com.example.wheterapp.screens.WeatherAppNavigation
import com.example.wheterapp.ui.theme.WheterAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WheterAppTheme {
                val navController = rememberNavController()
                Scaffold(
                    modifier = Modifier
                        .fillMaxSize(),
                    containerColor = Color.Blue.copy(alpha = 0.5f)
                ) { innerPadding ->
                    Box(modifier = Modifier.padding(innerPadding)) {
                        WeatherAppNavigation(navController)
                    }
                }
            }
        }
    }
}
