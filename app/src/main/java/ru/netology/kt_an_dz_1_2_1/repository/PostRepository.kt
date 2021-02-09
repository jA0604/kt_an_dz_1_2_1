package ru.netology.kt_an_dz_1_2_1.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import ru.netology.kt_an_dz_1_2_1.model.Post

class PostRepository : RepoPost {
    private val liveData = MutableLiveData<Post>()
    override val data: LiveData<Post>
        get() = liveData

    override fun like() {
        TODO("Not yet implemented")
    }

    override fun share() {
        TODO("Not yet implemented")
    }
}