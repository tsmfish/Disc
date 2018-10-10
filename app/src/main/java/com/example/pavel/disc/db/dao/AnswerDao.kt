package com.example.pavel.disc.db.dao

import android.arch.persistence.room.*
import com.example.pavel.disc.db.entity.AnswerDB

@Dao
interface AnswerDao {
    @Query("select * from AnswerDB where _id = :id")
    fun findById(id: Long): AnswerDB

    @Insert
    fun insert(answerDB: AnswerDB)

    @Update
    fun update(answerDB: AnswerDB)

    @Delete
    fun delete(answerDB: AnswerDB)
}