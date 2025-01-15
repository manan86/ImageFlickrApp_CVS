package com.example.imageflickrapp.presentation.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.navigation.compose.rememberNavController
import com.example.imageflickrapp.presentation.view.navigation.AppNavHost
import com.example.imageflickrapp.presentation.viewmodel.PhotoListViewModel
import com.example.imageflickrapp.ui.theme.ImageFlickrAppTheme
import dagger.hilt.android.AndroidEntryPoint

/**
 * MainActivity serves as the entry point for the ImageFlickrApp, setting up the navigation graph
 * and initializing the ViewModel to handle data and UI interactions.
 */
@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val photoListViewModel by viewModels<PhotoListViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ImageFlickrAppTheme {
                val navController = rememberNavController()
                AppNavHost(navController,photoListViewModel)
            }
        }
    }
}
