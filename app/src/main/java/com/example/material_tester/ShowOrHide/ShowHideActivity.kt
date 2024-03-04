package com.example.material_tester.ShowOrHide

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.material_tester.R

class ShowHideActivity : AppCompatActivity() {
    private lateinit var contentView: View
    private lateinit var loadingView: View
    private var shortAnimationDuration: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        contentView = findViewById(R.id.content)
        loadingView = findViewById(R.id.loading_spinner)

        contentView.visibility = View.GONE

        shortAnimationDuration = 9000;

        crossfade();
    }
     private fun crossfade(){
         contentView.apply {
             alpha=0f;
             visibility=View.VISIBLE;

             animate()
                 .alpha(1f)
                 .setDuration(shortAnimationDuration.toLong())
                 .setListener(null);
         }
        loadingView.animate()
                .alpha(0f)
                .setDuration(shortAnimationDuration.toLong())
                .setListener(object : AnimatorListenerAdapter() {
                    override fun onAnimationEnd(animation: Animator) {
                        loadingView.visibility = View.GONE
                    }
                })
     }

}