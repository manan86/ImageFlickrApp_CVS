package com.example.imageflickrapp.data.dto

import com.google.gson.annotations.SerializedName

/**
 * Data class representing the response from the photo API, containing metadata like title,
 * link, description, and other fields, along with a list of photo items.
 */
data class PhotoResponse(
    @SerializedName("title")
    val title: String,

    @SerializedName("link")
    val link: String,

    @SerializedName("description")
    val description: String,

    @SerializedName("modified")
    val modified: String,

    @SerializedName("generator")
    val generator: String,

    @SerializedName("items")
    val items: List<Items>,
)
