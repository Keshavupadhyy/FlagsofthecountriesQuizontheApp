package com.example.flagsofthecountriesquizontheapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.content.withStyledAttributes
import com.example.flagsofthecountriesquizontheapp.ui.QuestionActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startButton: Button = findViewById(R.id.button_start)
        val editTextName: EditText = findViewById(R.id.name)

        startButton.setOnClickListener {
            if (!editTextName.text.isEmpty())
                Intent(this@MainActivity, QuestionActivity::class.java).also {
                    startActivity(it)
                    finish()
                }else{
                    Toast.makeText(this@MainActivity,"PLease Enter your name",Toast.LENGTH_LONG).show()
            }
        }
    }
}