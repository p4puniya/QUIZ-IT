package com.example.andapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Result : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tv_name= findViewById<TextView>(R.id.tv_name)
        val username =intent.getStringExtra(Constants.username)
        tv_name.text= username
        val totalQuestions = intent.getIntExtra(Constants.total_Questions,0)
        val correctAnswers = intent.getIntExtra(Constants.correct_Answers,0)
        val tv_score = findViewById<TextView>(R.id.tv_score)
        tv_score.text = "Your Score is $correctAnswers out of $totalQuestions"

        val btn_finish= findViewById<Button>(R.id.btn_finish)
        btn_finish.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }
    }
}