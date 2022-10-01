package com.example.wishiizio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var input = findViewById<EditText>(R.id.editTextTextPersonName)
        var button = findViewById<Button>(R.id.button)

        button.setOnClickListener{

            var intent = Intent(this, MainActivity3::class.java)
            intent.putExtra("key", input.text.toString())
            startActivity(intent)

        }
    }
}