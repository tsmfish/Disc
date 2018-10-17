package com.example.pavel.disc.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.example.pavel.disc.db.dao.AnswerDao
import com.example.pavel.disc.db.dao.QuestionDao
import com.example.pavel.disc.db.entity.AnswerDB
import com.example.pavel.disc.db.entity.QuestionDB

@Database(entities = [AnswerDB::class, QuestionDB::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun getAnswerDao(): AnswerDao
    abstract fun getQuestionDao(): QuestionDao
}