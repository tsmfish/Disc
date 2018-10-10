package com.example.pavel.disc

import android.app.Application
import android.arch.persistence.room.Room
import com.example.pavel.disc.db.AppDatabase

class DiscApp : Application() {

    companion object {
        lateinit var db: AppDatabase
    }

    override fun onCreate() {
        super.onCreate()
        db = Room.databaseBuilder(this, AppDatabase::class.java, DiscApp::class.simpleName!!).build()
    }
}