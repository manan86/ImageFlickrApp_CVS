package com.example.imageflickrapp.domain.usecase

import com.example.imageflickrapp.domain.data.FetchImageState
import kotlinx.coroutines.flow.Flow

/**
 * Interface for the use case to fetch public photos based on a search term.
 * Returns a Flow of FetchImageState.
 */
interface IGetPublicPhotosUseCase {
    suspend operator fun invoke(searchTerm: String) : Flow<FetchImageState>
}