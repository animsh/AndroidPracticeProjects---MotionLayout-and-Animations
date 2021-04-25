package com.animsh.internshiptest

import android.os.Build
import android.os.Bundle
import android.widget.ImageView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    /* private lateinit var imageView2: ImageView
     private lateinit var imageView3: ImageView
     private lateinit var content: LinearLayout

     private lateinit var animator1: ObjectAnimator
     private lateinit var animator2: ObjectAnimator
     private lateinit var animator3: ObjectAnimator
     private lateinit var animatorContent: ObjectAnimator
     var isAnimateSet: Boolean = false*/


    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*  imageView2 = findViewById(R.id.image2)
          imageView3 = findViewById(R.id.image3)
          content = findViewById(R.id.content)

          imageView1.setOnTouchListener(this)*/

    }

    /* private fun scaleView(view: View, value: Float) {
         view.animate()
             .scaleY(value)
             .setInterpolator(AccelerateDecelerateInterpolator()).duration = 1000
     }

     override fun onTouch(view: View, motionEvent: MotionEvent): Boolean {
         when (view) {
             imageView1 -> {
                 when (motionEvent.action) {
                     MotionEvent.ACTION_DOWN -> {
                         if (!isAnimateSet) {
                             animator1 =
                                 ObjectAnimator.ofFloat(imageView1, "translationY", 600f).apply {
                                     duration = 1000
                                     start()
                                 }

                             animator2 =
                                 ObjectAnimator.ofFloat(imageView2, "translationY", 400f).apply {
                                     duration = 1000
                                     start()
                                 }

                             animator3 =
                                 ObjectAnimator.ofFloat(imageView3, "translationY", 200f).apply {
                                     duration = 1000
                                     start()
                                 }

                             animatorContent =
                                 ObjectAnimator.ofFloat(content, "translationY", 600f).apply {
                                     duration = 1000
                                     start()
                                 }

                             scaleView(imageView1, 0.8f)
                             scaleView(imageView2, 0.8f)
                             scaleView(imageView3, 0.8f)
                             isAnimateSet = true
                             view.performClick()
                         }

                     }
                     MotionEvent.ACTION_UP -> {
                         if (isAnimateSet) {
                             animator1.reverse()
                             animator2.reverse()
                             animator3.reverse()
                             animatorContent.reverse()

                             scaleView(imageView1, 1f)
                             scaleView(imageView2, 1f)
                             scaleView(imageView3, 1f)
                             isAnimateSet = false
                         }

                     }
                 }
             }
         }
         return true
     }*/
}
