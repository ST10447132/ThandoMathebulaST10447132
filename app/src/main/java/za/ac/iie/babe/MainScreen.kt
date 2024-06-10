package za.ac.iie.babe

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class MainScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_screen)

        val btnAdd: Button = findViewById<Button>(R.id.btnAdd)
        val btnClear = findViewById<Button>(R.id.btnClear)
        val btnView = findViewById<Button>(R.id.btnView)
        val btnExit2= findViewById<Button>(R.id.btnExit2)
        val tvDays = findViewById<TextView>(R.id.tvDays)
        val tvMinTemp = findViewById<TextView>(R.id.tvMinTemp)
        val tvMaxTemp = findViewById<TextView>(R.id.tvMaxTemp)
        val tvWeather = findViewById<TextView>(R.id.tvWeather)
        val etDays = findViewById<EditText>(R.id.etDays)
        val etMin = findViewById<EditText>(R.id.etMin)
        val etMax = findViewById<EditText>(R.id.etMax)
        val etCondition = findViewById<EditText>(R.id.etCondition)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btnAdd.setOnClickListener {
            val tvDays = etDays.text.toString()
            val tvMinTemp = etMin.text.toString()
            val tvMaxTemp = etMax.text.toString()
            val tvWeather = etCondition.text.toString()

        if tvDays.isNotEmpty()}
    }
}