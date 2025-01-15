package com.example.imageflickrapp.domain.repository

import com.example.imageflickrapp.domain.data.FetchImageState
import kotlinx.coroutines.flow.Flow

/**
 * Interface for the photo repository to handle image fetching.
 * Defines a method to fetch image states as a Flow based on a search term.
 */
interface IPhotoRepository {
    suspend fun fetchImageStateFlow(searchTerm: String) : Flow<FetchImageState>
}