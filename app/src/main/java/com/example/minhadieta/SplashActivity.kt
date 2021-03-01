package com.example.minhadieta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.minhadieta.model.User
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        supportActionBar?.hide()

        buttonEnter.setOnClickListener(this)
    }

    override fun onClick(view: View){
        val id = view.id
        if(id == R.id.buttonEnter){
            handleSave()
        }
    }
    private fun handleSave(){
        val name = editNameUser.text.toString()
        val heightUser = editHeigthUser.text.toString()
        val wheigth = editWheithUser.text.toString()

        var count = 0

        if(name != ""){
            if(wheigth != ""){
                if(heightUser!= ""){
                    startActivity(Intent(this, MainActivity::class.java))
                } else{
                    Toast.makeText(this, "Infome sua altura.", Toast.LENGTH_SHORT).show()
                }
            }else{
                Toast.makeText(this, "Infome seu peso.", Toast.LENGTH_SHORT).show()
            }
        } else {
            Toast.makeText(this, "Infome seu nome para entrar no App!", Toast.LENGTH_SHORT).show()
        }

        var user = User(++count,name, heightUser.toDouble(), wheigth.toDouble())

    }
}