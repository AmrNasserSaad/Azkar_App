package com.example.azkarapp.tasbehApp

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.azkarapp.R

@Preview
@Composable
private fun PreviewApp() {
    AzkarApp()
}


@Composable
fun AzkarApp() {
    var counter by remember { mutableIntStateOf(0) }
    var textFieldValue by remember { mutableStateOf(TextFieldValue("")) }


    Surface(
        modifier = Modifier
            .fillMaxSize()
            .clickable { counter++ },
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color(0xFF2196F3),
                            Color(0xFFBBDEFB)
                        )
                    )
                )
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {

            OutlinedTextField(
                value = textFieldValue,
                onValueChange = {
                    textFieldValue = it
                    counter = 0 // Reset the counter when text changes
                },
                label = {
                    Text(
                        "أدخل ذكر أو دعاء",
                        color = Color.White,
                        fontFamily = FontFamily(Font(R.font.cairo_regular))
                    )
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 22.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    cursorColor = Color.White,
                    focusedTextColor = Color.White,
                    unfocusedTextColor = Color.White,
                    focusedBorderColor = Color.White,
                    unfocusedBorderColor = Color.White,
                    focusedLabelColor = Color.White,
                )
            )
            Text(
                text = (textFieldValue.text),
                fontSize = 38.sp,
                fontFamily = FontFamily(Font(R.font.cairo_regular)),
                color = Color.White,
                textAlign = TextAlign.Center,
                style = TextStyle(lineHeight = 54.sp), // Add line height to text style
                modifier = Modifier.fillMaxWidth()
            )

            Text(
                modifier = Modifier.padding(bottom = 100.dp),
                text = "$counter",
                fontFamily = FontFamily(Font(R.font.cairo_regular)),
                fontSize = 64.sp,
                color = Color.White,
                textAlign = TextAlign.Center,
            )
        }
    }
}