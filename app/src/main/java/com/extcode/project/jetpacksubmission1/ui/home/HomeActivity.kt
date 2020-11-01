package com.extcode.project.jetpacksubmission1.ui.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.extcode.project.jetpacksubmission1.R
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        configViewPager()
    }

    private fun configViewPager() {
        val homeViewPagerAdapter = HomeViewPagerAdapter(this, supportFragmentManager)
        homeViewPager.adapter = homeViewPagerAdapter
        homeTabs.setupWithViewPager(homeViewPager)
    }
}