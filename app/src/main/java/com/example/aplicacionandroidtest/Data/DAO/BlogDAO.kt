package com.example.aplicacionandroidtest.Data.DAO

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.aplicacionandroidtest.Data.Models.BlogModel

@Dao
interface BlogDAO {
    @Query("select * from Blog")
    fun getBlogs():List<BlogModel>

    @Insert
    fun setBlog(blog: BlogModel)

    @Insert
    fun setBlogs(blog:List<BlogModel>)


    @Delete
    fun deleteBlog(id:String)
}