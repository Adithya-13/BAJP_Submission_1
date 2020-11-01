package com.extcode.project.jetpacksubmission1.ui.tvshows

import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class TvShowsViewModelTest {

    private lateinit var tvShowsViewModel: TvShowsViewModel

    @Before
    fun setUp() {
        tvShowsViewModel = TvShowsViewModel()
    }

    @Test
    fun getTvShows() {
        val tvShowLists = tvShowsViewModel.getTvShows()
        assertNotNull(tvShowLists)
        assertEquals(10, tvShowLists.size)
    }
}