package com.almatarm.exlog.ui.main

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.almatarm.exlog.R


/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [WorkoutsFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [WorkoutsFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class WorkoutsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_workouts, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @return A new instance of fragment WorkoutsFragment.
         */
        @JvmStatic
        fun newInstance() = WorkoutsFragment()
    }
}
