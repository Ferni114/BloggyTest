package com.example.aplicacionandroidtest.Data.Repositories

import com.example.aplicacionandroidtest.Data.Models.BlogModel
import com.example.aplicacionandroidtest.Data.DAO.BlogDAO
import com.example.aplicacionandroidtest.Data.RetrofitService
import com.example.aplicacionandroidtest.Domain.Repositories.BlogsRepositoryInt
import javax.inject.Inject

class BlogsRepository @Inject constructor(private val retrofitService: RetrofitService, private val blogDAO: BlogDAO):
    BlogsRepositoryInt {

    override suspend fun getBlogs(search:String): List<BlogModel> {
        val response=retrofitService.getBlogs(search)
        if(response.isSuccessful){
            blogDAO.setBlogs(response.body() as List<BlogModel>)
            return response.body() as List<BlogModel>
        }else{
            return blogDAO.getBlogs()
        }
    }

    override suspend fun postBlog(title:String, author:String, date:String, content:String): Int {
        val response=retrofitService.postBlog(title, author, date, content)
        if(response.isSuccessful){
            blogDAO.setBlog(response.body() as BlogModel)
            return 0
        }else{
            return 1
        }
    }

    override suspend fun deleteBlog(id:String): Int {
        val response=retrofitService.deleteBlog(id)
        if(response.isSuccessful){
            blogDAO.deleteBlog(id)
            return 0
        }else{
            return 1
        }
    }
}