package ru.netology.kt_an_dz_1_2_1.model

data class Post (
    val id: Long,
    val author: String,
    val content: String,
    val datePublished: String,
    val likedByMe: Boolean = true
        ) {
}