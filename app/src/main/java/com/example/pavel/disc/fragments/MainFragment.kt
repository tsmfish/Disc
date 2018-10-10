package com.example.pavel.disc.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.pavel.disc.DiscApp
import com.example.pavel.disc.R

class MainFragment : Fragment() {
    companion object {
        fun newInstance(): MainFragment {
            return MainFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        Log.d("MainFragment", DiscApp.Companion.db.toString())
        return inflater.inflate(R.layout.fragment_main, container, false)
    }
}