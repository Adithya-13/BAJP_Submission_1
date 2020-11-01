package com.extcode.project.jetpacksubmission1.ui.tvshows

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
import kotlinx.android.synthetic.main.fragment_tv_shows.*

class TvShowsFragment : Fragment(), ShareCallback {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tv_shows, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {
            val tvShowsViewModel = ViewModelProvider(
                this,
                ViewModelProvider.NewInstanceFactory()
            )[TvShowsViewModel::class.java]
            val tvShows = tvShowsViewModel.getTvShows()

            val tvShowsAdapter = TvShowsAdapter(this)
            tvShowsAdapter.setTvShowLists(tvShows)

            with(rvTvShows) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = tvShowsAdapter
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