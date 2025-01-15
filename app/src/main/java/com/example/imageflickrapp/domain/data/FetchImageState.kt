package com.example.imageflickrapp.domain.data

/**
 * Represents the states of fetching images: Pending, Fetching, Success with photos, or Error with a message.
 */
sealed class FetchImageState {
    object Pending : FetchImageState()
    object Fetching : FetchImageState()
    data class FetchedSuccessfully(val thumbnail : List<Photo>) : FetchImageState()
    data class ErrorOccurred(val message : String) : FetchImageState()
}