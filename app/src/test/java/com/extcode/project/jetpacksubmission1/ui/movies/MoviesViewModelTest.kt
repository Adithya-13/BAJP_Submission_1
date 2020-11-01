package com.extcode.project.jetpacksubmission1.ui.movies

import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class MoviesViewModelTest {

    private lateinit var moviesViewModel: MoviesViewModel

    @Before
    fun setUp() {
        moviesViewModel = MoviesViewModel()
    }

    @Test
    fun getMovies() {
        val movieLists = moviesViewModel.getMovies()
        assertNotNull(movieLists)
        assertEquals(10, movieLists.size)
    }
}