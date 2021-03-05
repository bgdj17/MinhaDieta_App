package com.example.minhadieta

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.minhadieta.model.Category
import kotlinx.android.synthetic.main.activity_splash.*
import kotlinx.android.synthetic.main.item.view.*
import android.content.Intent as Intent1
import android.content.Intent as Intent2

class CategoryAdapter(    val listCategories: MutableList<Category>, val context: Context
) : RecyclerView.Adapter<CategoryAdapter.CategoryHolder>() {

    class CategoryHolder(view: View) : RecyclerView.ViewHolder(view) {

        val name: TextView = view.findViewById(R.id.textViewItemName)
        val btn: ImageView = view.findViewById(R.id.imageViewItem)

        // var total : EditText = view.findViewById(R.id.textViewItemDescrip)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryAdapter.CategoryHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return CategoryHolder(view)
    }

    override fun onBindViewHolder(holder: CategoryAdapter.CategoryHolder, position: Int) {
        holder.name.text = listCategories[position].categoryName
        //older.total.text = listCategories[position].description
        //holder.img.imageAlpha = listCategories[position].im
        holder.itemView.setOnClickListener {
            val destiny = android.content.Intent(context, WaterActivity::class.java)
            context.startActivity(destiny)
        }
    }

    override fun getItemCount(): Int {
        return listCategories.size
    }

}