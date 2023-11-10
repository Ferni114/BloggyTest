package com.example.aplicacionandroidtest.UI.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import com.example.aplicacionandroidtest.UI.Adapters.BlogAdapter
import com.example.aplicacionandroidtest.UI.ViewModel.BlogsViewModel
import com.example.aplicacionandroidtest.databinding.ActivityListBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class ListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityListBinding
    @Inject
    lateinit var blogsVM: BlogsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loading(true)
    }

    fun loading(visible:Boolean){
        if(visible) {

            binding.list.visibility=View.INVISIBLE
        }else{
            binding.list.visibility = View.VISIBLE
        }
    }

    fun loadBlogs() {
        blogsVM.blogsViewModel.observe(this, Observer { list ->
            loading(false)
            binding.list.adapter= BlogAdapter(list)
        })
    }

    fun goToAddScreen(){
        startActivity(
            Intent(this@ListActivity, AddActivity::class.java))
    }
}