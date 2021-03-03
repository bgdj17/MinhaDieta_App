package com.example.minhadieta

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.minhadieta.model.Category

class CategoryAdapter(val listCategories: MutableList<Category>) : RecyclerView.Adapter<CategoryAdapter.CategoryHolder>() {

    class CategoryHolder(view: View) : RecyclerView.ViewHolder(view) {

        var name: TextView = view.findViewById(R.id.textViewItemName)
       // var img: ImageView = view.findViewById(R.id.imageViewItem)
       // var total : EditText = view.findViewById(R.id.textViewItemDescrip)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryAdapter.CategoryHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return CategoryHolder(view)
    }

    override fun onBindViewHolder(holder: CategoryAdapter.CategoryHolder, position: Int) {
        holder.name.text = listCategories[position].categoryName
        //older.total.text = listCategories[position].description
        //holder.img.imageAlpha =listCategories[position].imgItem

    }

    override fun getItemCount(): Int {
        return listCategories.size
    }
}