package com.extcode.project.jetpacksubmission1.ui.movies

import androidx.lifecycle.ViewModel
import com.extcode.project.jetpacksubmission1.data.MovieEntity
import com.extcode.project.jetpacksubmission1.utils.DummyData

class MoviesViewModel : ViewModel() {

    fun getMovies(): List<MovieEntity> = DummyData.getMovies()

}