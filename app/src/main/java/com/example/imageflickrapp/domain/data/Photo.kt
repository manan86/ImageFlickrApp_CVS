package com.example.imageflickrapp.domain.data

import com.google.gson.annotations.SerializedName

/**
 * Data class representing a photo with metadata such as link, title, description, author,
 * and the date when the photo was taken.
 */
data class Photo(
    @SerializedName("link")
    val link: String,

    @SerializedName("title")
    val title: String,

    @SerializedName("description")
    val description: String,

    @SerializedName("author")
    val author: String,

    @SerializedName("date_taken")
    val dataTaken : String
)
