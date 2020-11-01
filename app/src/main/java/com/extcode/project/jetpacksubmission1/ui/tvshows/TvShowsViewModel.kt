package com.extcode.project.jetpacksubmission1.ui.tvshows

import androidx.lifecycle.ViewModel
import com.extcode.project.jetpacksubmission1.data.MovieEntity
import com.extcode.project.jetpacksubmission1.utils.DummyData

class TvShowsViewModel : ViewModel() {

    fun getTvShows(): List<MovieEntity> = DummyData.getTvShows()

}