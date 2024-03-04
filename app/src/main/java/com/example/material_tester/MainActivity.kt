package com.example.material_tester

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    private lateinit var rocketAnimation: AnimationDrawable
    private  lateinit var viewAnim:Button;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewAnim=findViewById(R.id.view_anim)
        viewAnim();
        drawAnim();

    }
    private fun drawAnim(){
        val rocketImage = findViewById<ImageView>(R.id.rocket_image).apply {
        setBackgroundResource(R.drawable.actionbutton)
        rocketAnimation = background as AnimationDrawable
        }
        rocketImage.setOnClickListener({ rocketAnimation.start() })
    }
    private fun viewAnim(){
        val a:Animation=  AnimationUtils.loadAnimation(this, R.anim.hyperspace_jump)
                .also { hyperspaceJumpAnimation ->
                    hyperspaceJumpAnimation.repeatCount=Animation.INFINITE
                    hyperspaceJumpAnimation.repeatMode=Animation.RESTART
                    findViewById<Button>(R.id.view_anim).startAnimation(hyperspaceJumpAnimation)
                }
    }
}