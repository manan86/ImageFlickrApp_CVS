package com.example.imageflickrapp.domain.usecase

import com.example.imageflickrapp.domain.repository.IPhotoRepository
import javax.inject.Inject

/**
 * Use case for fetching public photos by delegating to the photo repository.
 */
class GetPublicPhotosUseCase @Inject constructor(
    private val imageRepository: IPhotoRepository
) : IGetPublicPhotosUseCase {
    override suspend fun invoke(searchTerm: String) = imageRepository.fetchImageStateFlow(searchTerm)
}



