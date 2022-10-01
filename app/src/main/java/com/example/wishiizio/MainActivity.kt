package com.example.wishiizio

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.annotation.RequiresApi
import com.airbnb.lottie.LottieAnimationView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    @RequiresApi(Build.VERSION_CODES.P)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Handler().postDelayed(
            {
                var intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
                finish()
            },2000
        )
        val anim3 = findViewById<LottieAnimationView>(R.id.surprise3)

        Handler(Looper.getMainLooper()).postDelayed(Runnable
        {
            anim3.visibility = View.VISIBLE
            anim3.playAnimation()
        },1)
    }
}