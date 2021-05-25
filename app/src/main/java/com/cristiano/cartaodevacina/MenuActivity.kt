package com.cristiano.cartaodevacina

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

    private lateinit var button: Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        button = findViewById(R.id.button)

        button.setOnClickListener {
            val intent = Intent(this, VacinacaoActivity::class.java)
            startActivity(intent)
        }

    }
}