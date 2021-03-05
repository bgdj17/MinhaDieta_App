package com.example.minhadieta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.minhadieta.model.Category
import com.example.minhadieta.model.User
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item.*

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user = intent.extras?.get("USER") as User


        var categories = mutableListOf<Category>(
            Category("Água", "Beber água!"),
            Category("Atividade Física", "Elásticos"),
            Category("Suplementos Vitamínicos", "Própolis, ômega 3, "),
            Category("Meditação", "Própolis, ômega 3, "),
            Category("Peso", "75k")
        )

        val listCategories = recyclerViewItem
        listCategories.adapter = CategoryAdapter(categories, this)
        listCategories.layoutManager = LinearLayoutManager(this)



        txtUserInput.text =
            "Olá ${user.nameUser}! \n\nSeu IMC é de ${user.getImc()}. \nVocê precisa beber ${user.getWater()} litros de água por dia!"
    }





}


