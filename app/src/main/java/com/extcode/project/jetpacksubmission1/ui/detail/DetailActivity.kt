package com.extcode.project.jetpacksubmission1.ui.detail

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ShareCompat
import androidx.lifecycle.ViewModelProvider
import com.extcode.project.jetpacksubmission1.R
import com.extcode.project.jetpacksubmission1.data.MovieEntity
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_MOVIE_ID = "extraMovieId"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        window.apply {
            clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
            statusBarColor = Color.TRANSPARENT
        }

        val detailViewModel = ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        )[DetailViewModel::class.java]

        val extras = intent.extras
        if (extras != null) {
            val id = extras.getString(EXTRA_MOVIE_ID)
            if (id != null) {
                detailViewModel.setId(id)
                populateDetail(detailViewModel.getDetail())
            }
        }

        backButton.setOnClickListener { onBackPressed() }
    }

    private fun populateDetail(movieEntity: MovieEntity) {

        // TODO: To activate ken burns effect, Delete or comment code below!!
        posterKenBurns.pause()

        titleDetail.text = movieEntity.title
        duration.text = movieEntity.duration
        date.text = movieEntity.releaseDate
        overview.text = movieEntity.overview
        genre.text = movieEntity.genre
        userScore.text = getString(R.string.score, movieEntity.userScore, "%")
        posterKenBurns.setImageResource(movieEntity.poster)
        subPoster.setImageResource(movieEntity.poster)
        subPoster.tag = movieEntity.poster

        share.setOnClickListener {
            val mimeType = "text/plain"
            ShareCompat.IntentBuilder.from(this).apply {
                setType(mimeType)
                setChooserTitle("Bagikan aplikasi ini sekarang.")
                setText("Saya sedang melihat film ${movieEntity.title} di Movie App, Download Aplikasi ini Sekarang!!")
                startChooser()
            }
        }
    }
}