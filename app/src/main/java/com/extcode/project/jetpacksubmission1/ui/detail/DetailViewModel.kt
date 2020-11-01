package com.extcode.project.jetpacksubmission1.ui.detail

import androidx.lifecycle.ViewModel
import com.extcode.project.jetpacksubmission1.data.MovieEntity
import com.extcode.project.jetpacksubmission1.utils.DummyData

class DetailViewModel : ViewModel() {

    private lateinit var id: String

    fun setId(id: String) {
        this.id = id
    }

    fun getDetail(): MovieEntity {
        lateinit var entity: MovieEntity
        val entityList = ArrayList<MovieEntity>()
        entityList.addAll(DummyData.getMovies())
        entityList.addAll(DummyData.getTvShows())
        for (movie in entityList) {
            if (movie.id == id) {
                entity = movie
            }
        }
        return entity
    }


}