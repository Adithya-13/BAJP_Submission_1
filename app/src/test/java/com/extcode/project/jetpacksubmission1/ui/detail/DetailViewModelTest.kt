package com.extcode.project.jetpacksubmission1.ui.detail

import com.extcode.project.jetpacksubmission1.utils.DummyData
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class DetailViewModelTest {

    private lateinit var detailViewModel: DetailViewModel
    private val dummyMovie = DummyData.getMovies()[0]
    private val movieId = dummyMovie.id

    @Before
    fun setUp() {
        detailViewModel = DetailViewModel()
        detailViewModel.setId(movieId)
    }

    @Test
    fun getDetail() {
        detailViewModel.setId(movieId)
        val movieEntity = detailViewModel.getDetail()
        assertNotNull(movieEntity)
        assertEquals(dummyMovie.id, movieEntity.id)
        assertEquals(dummyMovie.userScore, movieEntity.userScore)
        assertEquals(dummyMovie.title, movieEntity.title)
        assertEquals(dummyMovie.duration, movieEntity.duration)
        assertEquals(dummyMovie.genre, movieEntity.genre)
        assertEquals(dummyMovie.overview, movieEntity.overview)
        assertEquals(dummyMovie.releaseDate, movieEntity.releaseDate)
        assertEquals(dummyMovie.poster, movieEntity.poster)
    }
}