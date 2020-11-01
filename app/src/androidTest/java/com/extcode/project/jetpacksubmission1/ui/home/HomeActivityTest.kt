package com.extcode.project.jetpacksubmission1.ui.home

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.rule.ActivityTestRule
import com.extcode.project.jetpacksubmission1.R
import com.extcode.project.jetpacksubmission1.utils.DummyData
import org.hamcrest.CoreMatchers.equalTo
import org.junit.Rule
import org.junit.Test


class HomeActivityTest {

    private val movieLists = DummyData.getMovies()

    @get:Rule
    var activityRule = ActivityTestRule(HomeActivity::class.java)

    @Test
    fun loadMovies() {
        onView(withId(R.id.rvMovies)).check(matches(isDisplayed()))
        onView(withId(R.id.rvMovies)).perform(
            RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
                movieLists.size
            )
        )
    }

    @Test
    fun loadDetailMovie() {
        onView(withId(R.id.rvMovies)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                0,
                click()
            )
        )
        onView(withId(R.id.titleDetail)).check(matches(isDisplayed()))
        onView(withId(R.id.titleDetail)).check(matches(withText(movieLists[0].title)))
        onView(withId(R.id.duration)).check(matches(isDisplayed()))
        onView(withId(R.id.duration)).check(matches(withText(movieLists[0].duration)))
        onView(withId(R.id.date)).check(matches(isDisplayed()))
        onView(withId(R.id.date)).check(matches(withText(movieLists[0].releaseDate)))
        onView(withId(R.id.genre)).check(matches(isDisplayed()))
        onView(withId(R.id.genre)).check(matches(withText(movieLists[0].genre)))
        onView(withId(R.id.userScore)).check(matches(isDisplayed()))
        onView(withId(R.id.userScore)).check(matches(withText("${movieLists[0].userScore} %")))
        onView(withId(R.id.overview)).check(matches(isDisplayed()))
        onView(withId(R.id.overview)).check(matches(withText(movieLists[0].overview)))
        onView(withId(R.id.subPoster)).check(matches(isDisplayed()))
        onView(withId(R.id.subPoster)).check(matches(withTagValue(equalTo(movieLists[0].poster))))
    }

    @Test
    fun loadTvShows() {
        onView(withText("TV Shows")).perform(click())
        onView(withId(R.id.rvTvShows)).check(matches(isDisplayed()))
        onView(withId(R.id.rvTvShows)).perform(
            RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
                movieLists.size
            )
        )
    }
}