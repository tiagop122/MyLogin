package pt.tiago.mylogin
import android.content.Intent
import android.widget.ListView
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register)
        // Referência ao botão
        val button = findViewById<Button>(R.id.backBut)

        button.setOnClickListener {
            // Criando um intent para abrir a SecondActivity
            val intent = Intent(this@Register, MainActivity::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val listView2 = findViewById<ListView>(R.id.listView2)
        val values = mutableListOf<String> ("1", "2", "3", "4", "5", "6", "7", "8","9", "10", "11", "12", "13", "14", "15","16", "17", "18", "19", "20")

        var adapter = MySimpleArrayAdapter(this, R.layout.layout_item,values)
        listView2.adapter = adapter

    }
}