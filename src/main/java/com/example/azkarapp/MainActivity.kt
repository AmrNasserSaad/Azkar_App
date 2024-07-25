package com.example.azkarapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import com.example.azkarapp.tasbehApp.AzkarApp
import com.example.azkarapp.tasbehApp.AzkarViewModel
import com.example.azkarapp.ui.theme.AzkarAppTheme

class MainActivity : ComponentActivity() {

    private val viewModel: AzkarViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AzkarAppTheme {

                AzkarApp(viewModel)

            }
        }
    }

}

