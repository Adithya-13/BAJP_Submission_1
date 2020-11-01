package com.extcode.project.jetpacksubmission1.ui.movies

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

class MoviesAdapter(private val callback: ShareCallback) :
    RecyclerView.Adapter<MoviesAdapter.MoviesViewHolder>() {

    private var movieLists = ArrayList<MovieEntity>()

    fun setMovieLists(modules: List<MovieEntity>) {
        movieLists.clear()
        movieLists.addAll(modules)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        return MoviesViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_card_list, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        holder.bind(movieLists[position])
    }

    override fun getItemCount(): Int = movieLists.size

    inner class MoviesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
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