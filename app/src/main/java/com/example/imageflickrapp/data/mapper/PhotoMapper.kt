package com.example.imageflickrapp.data.mapper

import com.example.imageflickrapp.data.dto.Items
import com.example.imageflickrapp.domain.data.Photo

/**
 * Maps Items entity to Photo domain model.
 * Converts properties from Items to Photo for use in the domain layer.
 */
object PhotoMapper : Mapper<Items, Photo> {
    override fun mapToDomain(type: Items): Photo {
        return Photo(
            link = type.media.thumbnailUrl,
            title = type.title,
            description = type.description,
            author = type.author,
            dataTaken = type.dateTaken
        )
    }
}