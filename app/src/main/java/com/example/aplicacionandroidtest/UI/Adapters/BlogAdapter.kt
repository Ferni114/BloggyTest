package com.example.aplicacionandroidtest.UI.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.aplicacionandroidtest.Data.Models.BlogModel
import com.example.aplicacionandroidtest.R

class BlogAdapter(val blogs:List<BlogModel>): RecyclerView.Adapter<BlogAdapter.ViewHolder>() {
    class ViewHolder(item: View) : RecyclerView.ViewHolder(item) {
        val title: TextView =item.findViewById(R.id.title)
        val author:TextView=item.findViewById(R.id.author)
        val date:TextView=item.findViewById(R.id.date)
        val content:TextView=item.findViewById(R.id.content)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_card, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return blogs.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val blogModel=blogs[position]
        holder.title.text=blogModel.title
        holder.content.text=blogModel.content
        holder.author.text=blogModel.author
        holder.date.text=blogModel.date
    }
}