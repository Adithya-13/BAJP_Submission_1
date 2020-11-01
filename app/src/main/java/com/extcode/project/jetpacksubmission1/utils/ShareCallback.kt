package com.extcode.project.jetpacksubmission1.utils

import com.extcode.project.jetpacksubmission1.data.MovieEntity

interface ShareCallback {
    fun onShareClick(movieEntity: MovieEntity)
}
