package com.example.wheterapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.em
import com.example.wheterapp.R
import com.example.wheterapp.ui.theme.LinearBackgroundGradient

@Composable
fun OnboardingScreen(
    onStartClicked: () -> Unit,
) {
    Column(verticalArrangement = Arrangement.Top,
        modifier = Modifier.fillMaxSize()
            .background(brush = LinearBackgroundGradient.brush)) {
        Image(
            bitmap = ImageBitmap.imageResource(R.drawable.weatherimg), // alt: painter = painterResource(R.drawable.weatherimg)
            contentDescription = "Облако"
        )

        Text(
            lineHeight = 2.5.em,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            color = Color(red = 255, green = 255, blue = 255),
            text = "Weather"
        )

        Text(
            lineHeight = 2.5.em,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            color = Color(red = 221, green = 177, blue = 48),
            text = "ForeCasts"
        )

        Button(
            onClick = onStartClicked,
            content = {
                Text(text = "Get Start")
            }
        )
    }
}
