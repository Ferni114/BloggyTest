package com.example.aplicacionandroidtest.Data

import com.example.aplicacionandroidtest.Data.Models.BlogResponse
import retrofit2.Response
import retrofit2.http.DELETE
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface RetrofitService {
    @GET("blogs")
    suspend fun getBlogs(@Query("search") search:String): Response<BlogResponse>

    @FormUrlEncoded
    @POST("blog")
    suspend fun postBlog(@Field("title") title:String, @Field("author") author:String, @Field("date") date:String, @Field("content") content:String):Response<BlogResponse>

    @DELETE("blog/{id}")
    suspend fun deleteBlog(@Path("id") id:String):Response<BlogResponse>
}