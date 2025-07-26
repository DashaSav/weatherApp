package com.example.wheterapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.wheterapp.ui.theme.LinearBackgroundGradient

// TODO: модифаер кинуть последним параметром
// TODO: располагать параметры в несколько строк когда их много и не помещаются
@Composable
fun LoginScreen(modifier: Modifier = Modifier, onLoginClick: () -> Unit) {

    val email = remember{mutableStateOf("")}
    val password = remember{mutableStateOf("")}

    Column(modifier = modifier
        .background(brush = LinearBackgroundGradient.brush)
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Регистрация",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier.padding(bottom = 50.dp)
        )

        OutlinedTextField(
            value = email.value,
            onValueChange = { email.value = it },
            label = { Text("Логин") },
            placeholder = { Text("Введите ваш емейл") },
        )

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = password.value,
            onValueChange = { password.value = it },
            label = { Text("Пароль") },
            placeholder = { Text("Введите ваш пароль") },
        )

        Spacer(modifier = Modifier.height(40.dp))

        Button(
            onClick = onLoginClick,
            content = {
                Text(text = "Войти")
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LoginScreen {}
}