package com.example.andapplication

import android.animation.ObjectAnimator
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Intro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        val logo= findViewById<ImageView>(R.id.img_logo)
        val appName= findViewById<TextView>(R.id.tv_name)
        val splashing= findViewById<ImageView>(R.id.img_background)

        ObjectAnimator.ofFloat(splashing, "translationY", -2500f).apply {
            duration = 1500
            startDelay = 3000
            start()
        }
        ObjectAnimator.ofFloat(appName, "translationY", 2000f).apply {
            duration = 2000
            startDelay = 3000
            start()
        }
        ObjectAnimator.ofFloat(logo, "translationY", 2000f).apply {
            duration = 2000
            startDelay = 3000
            start()
        }

        val handler = Handler()
        handler.postDelayed(Runnable {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, 5000)
    }
}