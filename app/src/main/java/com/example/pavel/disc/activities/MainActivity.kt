package com.example.pavel.disc.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.pavel.disc.R
import com.example.pavel.disc.fragments.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager
                .beginTransaction()
                .replace(R.id.fr_main, MainFragment.newInstance())
                .commit()
    }

}
