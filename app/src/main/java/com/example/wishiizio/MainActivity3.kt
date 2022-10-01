package com.example.wishiizio

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.TextView
import com.airbnb.lottie.LottieAnimationView

class MainActivity3 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var name = intent.getStringExtra("key")
        var textname=findViewById<TextView>(R.id.textView6)
        textname.setText("$name")

        val anim = findViewById<LottieAnimationView>(R.id.surprise)

        Handler(Looper.getMainLooper()).postDelayed(Runnable
        {
            anim.visibility = View.VISIBLE
            anim.playAnimation()
        },10)

        val anim2 = findViewById<LottieAnimationView>(R.id.surprise2)

        Handler(Looper.getMainLooper()).postDelayed(Runnable
        {
            anim2.visibility = View.VISIBLE
            anim2.playAnimation()
        },50)
        anim2.setOnClickListener{
            anim2.playAnimation()
        }

        anim.setOnClickListener{
            anim.playAnimation()
        }

    }
}