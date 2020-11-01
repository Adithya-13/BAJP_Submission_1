package com.extcode.project.jetpacksubmission1.ui.tvshows

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.extcode.project.jetpacksubmission1.R
import com.extcode.project.jetpacksubmission1.data.MovieEntity
import com.extcode.project.jetpacksubmission1.ui.detail.DetailActivity
import com.extcode.project.jetpacksubmission1.utils.ShareCallback
import kotlinx.android.synthetic.main.item_card_list.view.*

class TvShowsAdapter(private val callback: ShareCallback) :
    RecyclerView.Adapter<TvShowsAdapter.TvShowsViewHolder>() {

    private var tvShowLists = ArrayList<MovieEntity>()

    fun setTvShowLists(modules: List<MovieEntity>) {
        tvShowLists.clear()
        tvShowLists.addAll(modules)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvShowsViewHolder {
        return TvShowsViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_card_list, parent, false)
        )
    }

    override fun onBindViewHolder(holder: TvShowsViewHolder, position: Int) {
        holder.bind(tvShowLists[position])
    }

    override fun getItemCount(): Int = tvShowLists.size

    inner class TvShowsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(movieEntity: MovieEntity) {
            with(itemView) {
                title.text = movieEntity.title
                duration.text = movieEntity.duration
                date.text = movieEntity.releaseDate
                genre.text = movieEntity.genre
                userScore.text = context.getString(R.string.score, movieEntity.userScore, "%")
                poster.setImageResource(movieEntity.poster)

                share.setOnClickListener { callback.onShareClick(movieEntity) }

                setOnClickListener {
                    context.startActivity(Intent(context, DetailActivity::class.java).apply {
                        putExtra(DetailActivity.EXTRA_MOVIE_ID, movieEntity.id)
                    })
                }
            }
        }
    }
}