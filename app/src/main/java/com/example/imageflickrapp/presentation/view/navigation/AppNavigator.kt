package com.example.imageflickrapp.presentation.view.navigation

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.imageflickrapp.presentation.view.detail.DetailedScreen
import com.example.imageflickrapp.presentation.view.home.HomeScreen
import com.example.imageflickrapp.presentation.view.home.SplashScreen
import com.example.imageflickrapp.presentation.viewmodel.PhotoListViewModel

/**
 * AppNavHost composable manages the navigation between different screens in the app,
 * starting with the splash screen and supporting transitions to home and detail screens.
 */
@Composable
fun AppNavHost(navController: NavHostController, photoListViewModel: PhotoListViewModel) {
    NavHost(
        navController = navController,
        startDestination = AppScreen.Splash.route
    ) {
        composable(
            route = "splash",
            enterTransition = {
                fadeIn(animationSpec = tween(500))
            },
            exitTransition = {
                fadeOut(animationSpec = tween(500))
            }
        ) {
            SplashScreen(navController = navController)
        }

        composable(
            route = AppScreen.Home.route,
            enterTransition = {
                slideIntoContainer(
                    towards = AnimatedContentTransitionScope.SlideDirection.Left,
                    animationSpec = tween(700)
                )
            },
            exitTransition = {
                slideOutOfContainer(
                    towards = AnimatedContentTransitionScope.SlideDirection.Left,
                    animationSpec = tween(700)
                )
            },
            popEnterTransition = {
                slideIntoContainer(
                    towards = AnimatedContentTransitionScope.SlideDirection.Right,
                    animationSpec = tween(700)
                )
            },
            popExitTransition = {
                slideOutOfContainer(
                    towards = AnimatedContentTransitionScope.SlideDirection.Right,
                    animationSpec = tween(700)
                )
            }
        ) {
            HomeScreen(navController, photoListViewModel)
        }

        composable(
            route = AppScreen.Detail.route,
            enterTransition = {
                slideIntoContainer(
                    towards = AnimatedContentTransitionScope.SlideDirection.Left,
                    animationSpec = tween(700)
                )
            },
            exitTransition = {
                slideOutOfContainer(
                    towards = AnimatedContentTransitionScope.SlideDirection.Left,
                    animationSpec = tween(700)
                )
            },
            popEnterTransition = {
                slideIntoContainer(
                    towards = AnimatedContentTransitionScope.SlideDirection.Right,
                    animationSpec = tween(700)
                )
            },
            popExitTransition = {
                slideOutOfContainer(
                    towards = AnimatedContentTransitionScope.SlideDirection.Right,
                    animationSpec = tween(700)
                )
            }
        ) {
            DetailedScreen(photoListViewModel)
        }
    }
}