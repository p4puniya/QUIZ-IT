package com.example.andapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val name =findViewById<EditText>(R.id.et_name) as EditText
        val button=findViewById<Button>(R.id.btn_start) as Button

        button.setOnClickListener {
            if(name.text.toString().isEmpty()) {
                Toast.makeText(this, "Please enter your name", Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this, Quiz_question_activity::class.java)
                intent.putExtra(Constants.username,name.text.toString())
                startActivity(intent)
                finish()
            }
        }

    }
}