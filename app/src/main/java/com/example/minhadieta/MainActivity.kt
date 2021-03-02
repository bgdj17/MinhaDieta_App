package com.example.minhadieta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.minhadieta.model.User
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user = intent.extras?.get("USER") as User

        textViewMain1.text ="Olá ${user.nameUser}! Seu IMC é de ${user.getImc()}. Você precisa beber ${user.getWater()} litros de água por dia!"
    }


}