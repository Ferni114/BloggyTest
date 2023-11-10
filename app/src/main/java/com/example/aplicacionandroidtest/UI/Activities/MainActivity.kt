package com.example.aplicacionandroidtest.UI.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.aplicacionandroidtest.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        goToNextScreen()
    }

    fun goToNextScreen(){
        val handler = Handler()
        val runnable = object : Runnable {
            override fun run() {
                handler.removeCallbacksAndMessages(null)
                startActivity(Intent(this@MainActivity, ListActivity::class.java))
            }
        }
        handler.postDelayed(runnable,3000)
    }
}