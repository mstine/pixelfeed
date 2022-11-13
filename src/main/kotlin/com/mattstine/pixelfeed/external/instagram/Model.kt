package com.mattstine.pixelfeed.external.instagram

import java.math.BigDecimal

data class Post(
    val media: List<Media>
)

data class Media(
    val url: String,
    val creationTimestamp: String,
    val mediaMetadata: MediaMetadata,
    val title: String
)

data class MediaMetadata(
    val photoMetadata: PhotoMetadata
)

data class PhotoMetadata(
    val exifData: List<ExifData>
)

data class ExifData(
    val latitude: BigDecimal?,
    val longitude: BigDecimal?,
    val iso: Int?,
    val focalLength: String?,
    val lensModel: String?,
    val sceneCaptureType: String?,
    val software: String?,
    val deviceId: String?,
    val sceneType: Int?,
    val cameraPosition: String?,
    val lensMake: String?,
    val dateTimeDigitized: String?,
    val dateTimeOriginal: String?,
    val sourceType: String?,
    val aperture: String?,
    val shutterSpeed: String?,
    val meteringMode: String?,
)