package pt.tiago.mylogin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CreatAcc : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_creat_acc)

        // Referência ao botão
        val button = findViewById<Button>(R.id.registerButton)

        // Configurando o clique no botão
        button.setOnClickListener {
            // Criando um intent para abrir a SecondActivity
            val intent = Intent(this@CreatAcc, MainActivity::class.java)
            startActivity(intent)
        }
        }
    }
