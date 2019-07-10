package com.almatarm.exlog.ui.main

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.almatarm.exlog.R
import kotlin.RuntimeException

private val TAB_TITLES = arrayOf(
    R.string.tab_workout,
    R.string.tab_exercises
)

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) : FragmentPagerAdapter(fm) {


    override fun getItem(position: Int): Fragment {
        // getItem is called to instantiate the fragment for the given page.
        when (position) {
            0 -> return WorkoutsFragment.newInstance()
            1 -> return ExercisesFragment.newInstance()
        }
        return WorkoutsFragment.newInstance()
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        return TAB_TITLES.size
    }
}