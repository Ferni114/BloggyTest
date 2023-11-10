package com.example.aplicacionandroidtest.Data.Models

import com.google.gson.annotations.SerializedName

data class BlogResponse(
    @SerializedName("id")
    var id: String,
    @SerializedName("title")
    var title: String,
    @SerializedName("author")
    var author: String,
    @SerializedName("date")
    var date: String,
    @SerializedName("content")
    var content: String
)
