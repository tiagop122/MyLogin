package pt.tiago.mylogin
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referência ao botão
        val button = findViewById<Button>(R.id.loginButton)
        // Configurando o clique no botão
        button.setOnClickListener {
            // Criando um intent para abrir a SecondActivity
            val intent = Intent(this@MainActivity, Register::class.java)
            startActivity(intent)
        }
    }
}
