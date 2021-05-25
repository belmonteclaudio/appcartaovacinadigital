package com.cristiano.cartaodevacina

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


    private lateinit var editTextLogin : EditText
    private lateinit var editTextPassword : EditText
    private lateinit var btentrar : Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextLogin = findViewById(R.id.editTextLogin)
        editTextPassword = findViewById(R.id.editTextPassword)
        btentrar = findViewById((R.id.button3))



        btentrar.setOnClickListener {

            validaForm()
        }

    }
    private fun validaForm() : Boolean{
        var error = false
        if (editTextLogin.text.isEmpty()) {
            editTextLogin.error = "Campo Login deve ser preenchido!"
            error = true
        }
        if (editTextPassword.text.isEmpty()) {
            editTextPassword.error = "Campo Senha deve ser preenchido!"
            error = true
        }else{
            btentrar.setOnClickListener {
                val intent = Intent(this, MenuActivity::class.java)
                startActivity(intent)
            }

        }

        return false
    }

}