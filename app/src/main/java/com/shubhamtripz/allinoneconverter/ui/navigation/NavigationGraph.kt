package com.shubhamtripz.allinoneconverter.ui.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.shubhamtripz.allinoneconverter.ui.downloads.DownloadsScreen
import com.shubhamtripz.allinoneconverter.ui.features.compressimage.CompressImageScreen
import com.shubhamtripz.allinoneconverter.ui.features.imagepdf.ImageToPdfScreen
import com.shubhamtripz.allinoneconverter.ui.features.jpgtopng.JpgToPngScreen
import com.shubhamtripz.allinoneconverter.ui.features.mp4audio.Mp4ToAudioScreen
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
        composable(NavigationItem.Home.route) { HomeScreen(navController) }
        composable(NavigationItem.Tools.route) { ToolsScreen() }
        composable(NavigationItem.Downloads.route) { DownloadsScreen() }
        composable(NavigationItem.Settings.route) { SettingsScreen() }

        // Feature screens
        composable(NavigationItem.ImageToPdf.route) { ImageToPdfScreen() }
        composable(NavigationItem.JpgToPng.route) { JpgToPngScreen() }
        composable(NavigationItem.Mp4ToAudio.route) { Mp4ToAudioScreen() }
        composable(NavigationItem.CompressImage.route) { CompressImageScreen() }
    }
}
