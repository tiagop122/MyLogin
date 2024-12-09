package pt.tiago.mylogin
import android.widget.ListView
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val listView2 = findViewById<ListView>(R.id.listView2)
        val values = mutableListOf<String> ("Android", "Iphone", "Windows Mobile", "Blackberry", "WebOs", "Ubuntu", "Windows7","Android", "Iphone", "Windows Mobile", "Blackberry", "WebOs", "Ubuntu", "Windows7","Android", "Iphone", "Windows Mobile", "Blackberry", "WebOs", "Ubuntu", "Windows7","Android", "Iphone", "Windows Mobile", "Blackberry", "WebOs", "Ubuntu", "Windows7","Android", "Iphone", "Windows Mobile", "Blackberry", "WebOs", "Ubuntu", "Windows7")

        var adapter = MySimpleArrayAdapter(this, R.layout.layout_item,values)
        listView2.adapter = adapter

    }
}