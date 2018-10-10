package com.example.pavel.disc.db.entity

import android.arch.persistence.room.Entity
import android.arch.persistence.room.ForeignKey
import android.arch.persistence.room.PrimaryKey

@Entity(foreignKeys = [ForeignKey(entity = QuestionDB::class, parentColumns = ["_id"], childColumns = ["questionId"], onDelete = ForeignKey.NO_ACTION)])
class AnswerDB(@PrimaryKey var _id: Long, var answer: Integer, var questionId: Long)