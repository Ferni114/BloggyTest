package com.example.aplicacionandroidtest.Data.Models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Blog")
data class BlogModel(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var title: String,
    var author: String,
    var date: String,
    var content: String
)
