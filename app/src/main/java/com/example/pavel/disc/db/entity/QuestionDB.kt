package com.example.pavel.disc.db.entity

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
class QuestionDB(@PrimaryKey var _id: Long, var statement1: String, var statemant2: String, var statemant3: String, var statemant4: String)
