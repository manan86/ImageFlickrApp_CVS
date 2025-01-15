package com.example.imageflickrapp.data.dto

import com.google.gson.annotations.SerializedName

/**
 * Data class representing the media information, specifically the thumbnail URL of a photo.
 */
data class Media(
    @SerializedName("m")
    val thumbnailUrl: String
)
