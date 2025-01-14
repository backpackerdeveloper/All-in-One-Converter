package com.shubhamtripz.allinoneconverter.ui

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.shubhamtripz.allinoneconverter.ui.navigation.NavigationGraph

@Composable
fun AllInOneConverterApp() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
            BottomNavigationBar(navController)
        }
    ) { contentPadding ->
        NavigationGraph(navController, contentPadding)
    }
}
