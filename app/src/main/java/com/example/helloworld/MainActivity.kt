package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.sayHelloButton)
        button.setOnClickListener {
            Log.v("Hello World", "Button Clicked")
            Toast.makeText(this, "Hello, HAPPY New Year and may 2023 Treat you Well!", Toast.LENGTH_LONG).show()
        }
    }
}