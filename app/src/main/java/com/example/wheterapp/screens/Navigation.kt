package com.example.wheterapp.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun WeatherAppNavigation(navController: NavHostController){
    NavHost(navController = navController, startDestination = "onboarding") {
        composable(route = "onboarding"){
            OnboardingScreen( onStartClicked = {
                navController.navigate("login")
            })
        }

        composable(route = "login") {
            LoginScreen(onLoginClick = {
                navController.navigate("mainScreen")
            })
        }
        composable(route = "mainScreen") {
            MainScreen()
        }
    }
}