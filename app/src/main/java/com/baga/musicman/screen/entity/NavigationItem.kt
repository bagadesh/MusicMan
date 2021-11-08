package com.baga.musicman.screen.entity

sealed class NavigationItem(
    val title: String,
    val icon: Int,
    val route: String
) {
    object Home : NavigationItem(title = "Home", icon = 0, route = "home")
    object Settings : NavigationItem(title = "Settings", icon = 0, route = "settings")
}
