package com.nire.navbarexample.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.nire.navbarexample.screens.HomeScreen
import com.nire.navbarexample.screens.StartScreen

sealed class NavRoute(val route: String){
    object StartScreen: NavRoute("start_screen")
    object HomeScreen: NavRoute("home_screen")
}

@Composable
fun MyNavHost() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = NavRoute.StartScreen.route
    ){
        composable(NavRoute.StartScreen.route){ StartScreen(navController=navController)}
        composable(NavRoute.HomeScreen.route){ HomeScreen(navController=navController) }
    }
}