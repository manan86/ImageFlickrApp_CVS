package com.example.imageflickrapp.domain.usecase

import com.example.imageflickrapp.domain.data.FetchImageState
import com.example.imageflickrapp.domain.repository.IPhotoRepository
import io.mockk.coEvery
import io.mockk.mockk
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.test.*
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

/**
 * Unit tests for GetPublicPhotosUseCase, verifying the correct fetching of public photos
 * based on search query and handling different states like pending, success, and failure.
 */
@OptIn(ExperimentalCoroutinesApi::class)
class GetPublicPhotosUseCaseTest {

    private lateinit var getPublicPhotosUseCase: GetPublicPhotosUseCase
    private lateinit var photoRepository: IPhotoRepository
    private val testDispatcher = StandardTestDispatcher()

    @Before
    fun setup() {
        Dispatchers.setMain(testDispatcher)
        photoRepository = mockk()
        getPublicPhotosUseCase = GetPublicPhotosUseCase(photoRepository)
    }

    @After
    fun tearDown() {
        Dispatchers.resetMain()
    }

    @Test
    fun `use case returns Pending state when search term is empty`() = runTest {
        // Given
        coEvery { photoRepository.fetchImageStateFlow("") } returns flowOf(FetchImageState.Pending)

        // When
        val result = getPublicPhotosUseCase.invoke("")

        // Then
        result.collect { state ->
            assertEquals(FetchImageState.Pending, state)
        }
    }

    @Test
    fun `use case returns Failure state when repository returns error`() = runTest {
        // Given
        val errorMessage = "Failed to fetch photos"
        coEvery { photoRepository.fetchImageStateFlow("error") } returns flowOf(
            FetchImageState.Fetching,
            FetchImageState.ErrorOccurred(errorMessage)
        )

        // When
        val resultFlow = getPublicPhotosUseCase.invoke("error")

        // Then
        resultFlow.collect { state ->
            // Assert after flow emits all states
            if (state is FetchImageState.ErrorOccurred) {
                assertEquals(FetchImageState.ErrorOccurred(errorMessage), state)
            }
        }
    }
}
