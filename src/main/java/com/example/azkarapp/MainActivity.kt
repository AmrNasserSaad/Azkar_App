package com.example.azkarapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.azkarapp.tasbehApp.AzkarApp
import com.example.azkarapp.ui.theme.AzkarAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AzkarAppTheme {

                AzkarApp()

            }
        }
    }

}

