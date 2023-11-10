package com.example.aplicacionandroidtest.Domain.UseCases

import com.example.aplicacionandroidtest.Data.Repositories.BlogsRepository
import javax.inject.Inject

class DeleteUseCase @Inject constructor(private val blogsRepository: BlogsRepository) {
    suspend operator fun invoke(id:String): Int = blogsRepository.deleteBlog(id)
}