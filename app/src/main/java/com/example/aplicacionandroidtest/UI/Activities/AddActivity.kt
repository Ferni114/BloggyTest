package com.example.aplicacionandroidtest.UI.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import com.example.aplicacionandroidtest.UI.ViewModel.BlogsViewModel
import com.example.aplicacionandroidtest.databinding.ActivityAddBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class AddActivity : AppCompatActivity() {
    private lateinit var binding : ActivityAddBinding
    @Inject
    lateinit var blogsVM: BlogsViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

    fun addBlog() {
        blogsVM.blogsViewModel.observe(this, Observer { list ->
            loading(false)
        })
    }

    fun loading(visible:Boolean) {
        if (visible) {
        }
    }
}