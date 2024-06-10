package za.ac.iie.babe

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val tvStudentNumber = findViewById<TextView>(R.id.tvStudentNumber)
        val tvName = findViewById<TextView>(R.id.tvName)
        val tvStudentName = findViewById<TextView>(R.id.tvStudentName)
        val btnStart = findViewById<Button>(R.id.btnStart)
        val btnExit = findViewById<Button>(R.id.btnExit)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnStart.setOnClickListener {
            Log.v ("StudentName")
            Log.v ("StudentNumber")
            val intent = intent (this,MainActivity::class.java)
            startActivity(intent)
        }
        btnExit.setOnClickListener() {
            finish()
        }
    }

    class Log {
        companion object

    }
}

private fun MainActivity.Log.Companion.v(s: String) {
    TODO("Not yet implemented")
}
