package com.example.aplicacionandroidtest.Domain.UseCases

import com.example.aplicacionandroidtest.Data.Models.BlogModel
import com.example.aplicacionandroidtest.Data.Repositories.BlogsRepository
import javax.inject.Inject

class BlogsUseCase @Inject constructor(private val blogsRepository: BlogsRepository) {
    suspend operator fun invoke(search:String): List<BlogModel> = blogsRepository.getBlogs(search)
}