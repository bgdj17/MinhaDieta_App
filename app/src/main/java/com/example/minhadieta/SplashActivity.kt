package com.example.minhadieta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.minhadieta.model.User
import kotlinx.android.synthetic.main.activity_splash.*


class SplashActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var name: String
    lateinit var heightUser: String
    lateinit var wheigth: String
    lateinit var user: User


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        supportActionBar?.hide()

        buttonEnter.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        val id = view.id
        if (id == R.id.buttonEnter) {
            handleSave()
        }
    }

    fun redirect(user: User) {

        val keyUser = "USER"

        val destiny = Intent(this, MainActivity::class.java)
        destiny.putExtra(keyUser, user)

        startActivity(destiny)
    }

    private fun handleSave() {
        name = editNameUser.text.toString()
        heightUser = editHeigthUser.text.toString()
        wheigth = editWheithUser.text.toString()

        var count = 0

        if (name != "") {
            if (wheigth != "") {
                if (heightUser != "") {
                    user = User(++count, name, heightUser.toDouble(), wheigth.toDouble())
                    redirect(user)
                } else {
                    Toast.makeText(this, "Infome sua altura.", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Infome seu peso.", Toast.LENGTH_SHORT).show()
            }
        } else {
            Toast.makeText(this, "Infome seu nome para entrar no App!", Toast.LENGTH_SHORT).show()
        }



    }
}