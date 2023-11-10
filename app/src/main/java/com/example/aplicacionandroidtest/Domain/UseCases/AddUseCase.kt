package com.example.aplicacionandroidtest.Domain.UseCases

import com.example.aplicacionandroidtest.Data.Repositories.BlogsRepository
import javax.inject.Inject

class AddUseCase @Inject constructor(private val blogsRepository: BlogsRepository) {
    suspend operator fun invoke(title:String, author:String, date:String, content:String): Int = blogsRepository.postBlog(title, author, date, content)
}