package com.example.wheterapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.wheterapp.R
import com.example.wheterapp.ui.theme.LinearBackgroundGradient

@Composable
fun OnboardingScreen(
    onStartClicked: () -> Unit,
) {
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
            .background(brush = LinearBackgroundGradient.brush)) {
        Image(
            bitmap = ImageBitmap.imageResource(R.drawable.weatherimg), // alt: painter = painterResource(R.drawable.weatherimg)
            contentDescription = "Облако"
        )

        Spacer(modifier = Modifier.padding(top = 10.dp))

        Text(
            lineHeight = 1.2.em,
            fontWeight = FontWeight.Bold,
            fontSize = 64.sp,
            textAlign = TextAlign.Center,
            color = Color(red = 255, green = 255, blue = 255),
            text = "Weather"
        )

        Text(
            lineHeight = 1.2.em,
            fontWeight = FontWeight.Bold,
            fontSize = 64.sp,
            textAlign = TextAlign.Center,
            color = Color(red = 221, green = 177, blue = 48),
            text = "ForeCasts"
        )

        Spacer(modifier = Modifier.padding(top = 60.dp))

        Button(
            modifier = Modifier.width(304.dp).height(72.dp),
            onClick = onStartClicked,
            content = {
                Text(text = "Get Start",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold)
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(red = 221, green = 177, blue = 48),
                contentColor = Color(red = 54, green = 42, blue = 132)
            )
        )
    }
}
