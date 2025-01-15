package com.example.imageflickrapp.presentation.view.navigation

/**
 * AppScreen sealed class defines the different routes in the app's navigation system,
 * representing the splash, home, and detail screens.
 */
sealed class AppScreen(val route: String) {

    data object Splash : AppScreen("splash")
    data object Home : AppScreen("home")
    data object Detail : AppScreen("detail")
}
