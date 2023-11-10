package com.example.aplicacionandroidtest.Domain.Repositories

import com.example.aplicacionandroidtest.Data.Models.BlogModel

interface BlogsRepositoryInt {
    suspend fun getBlogs(search:String): List<BlogModel>

    suspend fun postBlog(title:String, author:String, date:String, content:String): Int

    suspend fun deleteBlog(id:String): Int
}