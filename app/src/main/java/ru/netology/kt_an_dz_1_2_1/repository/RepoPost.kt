package ru.netology.kt_an_dz_1_2_1.repository

import androidx.lifecycle.LiveData
import ru.netology.kt_an_dz_1_2_1.model.Post

interface RepoPost {
    val data: LiveData<Post>
    fun like()
    fun share()
}