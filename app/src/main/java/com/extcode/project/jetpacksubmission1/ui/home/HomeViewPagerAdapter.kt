package com.extcode.project.jetpacksubmission1.ui.home

import android.content.Context
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.extcode.project.jetpacksubmission1.R
import com.extcode.project.jetpacksubmission1.ui.movies.MoviesFragment
import com.extcode.project.jetpacksubmission1.ui.tvshows.TvShowsFragment

class HomeViewPagerAdapter(private val context: Context, fragmentManager: FragmentManager) :
    FragmentPagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    @StringRes
    private val tabTitles = intArrayOf(
        R.string.movies,
        R.string.tvshows
    )

    private val fragment: List<Fragment> = listOf(
        MoviesFragment(),
        TvShowsFragment()
    )

    override fun getPageTitle(position: Int): CharSequence? {
        return context.getString(tabTitles[position])
    }

    override fun getItem(position: Int): Fragment {
        return fragment[position]
    }

    override fun getCount(): Int = 2

}