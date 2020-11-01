package com.extcode.project.jetpacksubmission1.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MovieEntity(
    val id: String,
    val title: String,
    val releaseDate: String,
    val overview: String,
    val duration: String,
    val genre: String,
    val poster: Int,
    val userScore : Int,
) : Parcelable