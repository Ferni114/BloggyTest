package com.example.aplicacionandroidtest.UI.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.aplicacionandroidtest.Data.Models.BlogModel
import com.example.aplicacionandroidtest.Domain.UseCases.AddUseCase
import com.example.aplicacionandroidtest.Domain.UseCases.BlogsUseCase
import com.example.aplicacionandroidtest.Domain.UseCases.DeleteUseCase
import kotlinx.coroutines.launch
import javax.inject.Inject

class BlogsViewModel @Inject constructor(private val blogsUseCase: BlogsUseCase, private val addUseCase: AddUseCase, private val deleteUseCase: DeleteUseCase): ViewModel() {
    var blogsViewModel= MutableLiveData<List<BlogModel>>()

    init {
        getBlogs()
    }

    fun getBlogs(){
        viewModelScope.launch {
            val blogs:List<BlogModel> = blogsUseCase("")
            blogsViewModel.postValue(blogs)
        }
    }

    fun addBlog(title:String, author:String, date:String, content:String){
        viewModelScope.launch {
            val blog:Int = addUseCase(title, author, date, content)
        }
    }

    fun deleteBlog(){
        viewModelScope.launch {
            val blog:Int = deleteUseCase("")
        }
    }
}