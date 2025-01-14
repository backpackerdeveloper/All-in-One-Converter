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
}
