package com.example.minhadieta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.minhadieta.model.Category
import com.example.minhadieta.model.User
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user = intent.extras?.get("USER") as User

        var categories = mutableListOf<Category>(
            Category("Água", "Beber água!"),
            Category("Atividade Física","Elástic o extensor"),
            Category("Suplementos Vitamínicos", "Própolis, ômega 3, ")
        )

        val listCategories = recyclerViewItem
        listCategories.adapter = CategoryAdapter(categories)
        listCategories.layoutManager = LinearLayoutManager (this)

        txtUserInput.text ="Olá ${user.nameUser}! Seu IMC é de ${user.getImc()}. Você precisa beber ${user.getWater()} litros de água por dia!"
    }


}