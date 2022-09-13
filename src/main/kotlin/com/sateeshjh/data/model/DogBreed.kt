package com.sateeshjh.data.model

@kotlinx.serialization.Serializable
data class DogBreed(
    val name: String,
    val description: String,
    val imageUrl: String
)
