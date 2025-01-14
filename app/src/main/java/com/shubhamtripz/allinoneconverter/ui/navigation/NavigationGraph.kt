package com.shubhamtripz.allinoneconverter.ui.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.shubhamtripz.allinoneconverter.ui.downloads.DownloadsScreen
import com.shubhamtripz.allinoneconverter.ui.home.HomeScreen
import com.shubhamtripz.allinoneconverter.ui.settings.SettingsScreen
import com.shubhamtripz.allinoneconverter.ui.tools.ToolsScreen

@Composable
fun NavigationGraph(navController: NavHostController, contentPadding: PaddingValues) {
    NavHost(
        navController = navController,
        startDestination = NavigationItem.Home.route,
        modifier = Modifier.padding(contentPadding)
    ) {
        composable(NavigationItem.Home.route) { HomeScreen() }
        composable(NavigationItem.Tools.route) { ToolsScreen() }
        composable(NavigationItem.Downloads.route) { DownloadsScreen() }
        composable(NavigationItem.Settings.route) { SettingsScreen() }
    }
}
