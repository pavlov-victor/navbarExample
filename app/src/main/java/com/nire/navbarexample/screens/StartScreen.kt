package com.nire.navbarexample.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.nire.navbarexample.navigation.NavRoute

@Composable
fun StartScreen(navController: NavController) {
    Scaffold(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "Start")
            Button(onClick = { navController.navigate(route=NavRoute.HomeScreen.route) }) {
                Text(text = "Go to Home")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun prevStartScreen(){
    StartScreen(navController = rememberNavController())
}