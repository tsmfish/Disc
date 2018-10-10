package com.example.pavel.disc.db.dao

import android.arch.persistence.room.*
import com.example.pavel.disc.db.entity.QuestionDB

@Dao
interface QuestionDao {
    @Query("select * from QuestionDB where _id = :id")
    fun findById(id: Long): QuestionDB

    @Insert
    fun insert(questionDB: QuestionDB)

    @Update
    fun update(questionDB: QuestionDB)

    @Delete
    fun delete(questionDB: QuestionDB)
}