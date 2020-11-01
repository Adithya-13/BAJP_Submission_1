package com.extcode.project.jetpacksubmission1.ui.movies

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ShareCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.extcode.project.jetpacksubmission1.R
import com.extcode.project.jetpacksubmission1.data.MovieEntity
import com.extcode.project.jetpacksubmission1.utils.ShareCallback
import kotlinx.android.synthetic.main.fragment_movies.*

class MoviesFragment : Fragment(), ShareCallback {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_movies, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {
            val moviesViewModel = ViewModelProvider(
                this,
                ViewModelProvider.NewInstanceFactory()
            )[MoviesViewModel::class.java]
            val movies = moviesViewModel.getMovies()

            val moviesAdapter = MoviesAdapter(this)
            moviesAdapter.setMovieLists(movies)

            with(rvMovies) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = moviesAdapter
            }
        }
    }

    override fun onShareClick(movieEntity: MovieEntity) {
        val mimeType = "text/plain"
        ShareCompat.IntentBuilder.from(requireActivity()).apply {
            setType(mimeType)
            setChooserTitle("Bagikan aplikasi ini sekarang.")
            setText("Saya sedang melihat film ${movieEntity.title} di Movie App, Download Aplikasi ini Sekarang!!")
            startChooser()
        }
    }
}