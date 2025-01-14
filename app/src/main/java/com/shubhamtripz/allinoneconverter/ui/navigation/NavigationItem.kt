package com.shubhamtripz.allinoneconverter.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

// NavigationItem.kt
sealed class NavigationItem(var route: String, var icon: ImageVector, var title: String) {
    object Home : NavigationItem("home", Icons.Filled.Home, "Home")
    object Tools : NavigationItem("tools", Icons.Filled.Build, "Tools")
    object Downloads : NavigationItem("downloads", Icons.Filled.Build, "Downloads")
    object Settings : NavigationItem("settings", Icons.Filled.Settings, "Settings")

    // Additional routes for QuickActionCard clicks
    object ImageToPdf : NavigationItem("image_to_pdf", Icons.Filled.Build, "Image to PDF")
    object JpgToPng : NavigationItem("jpg_to_png", Icons.Filled.Build, "JPG to PNG")
    object Mp4ToAudio : NavigationItem("mp4_to_audio", Icons.Filled.Build, "MP4 to Audio")
    object CompressImage : NavigationItem("compress_image", Icons.Filled.Build, "Compress Image")
}
