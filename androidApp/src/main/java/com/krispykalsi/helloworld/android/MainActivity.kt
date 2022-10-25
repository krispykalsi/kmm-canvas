package com.krispykalsi.helloworld.android

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.krispykalsi.helloworld.core.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imgView = findViewById<ImageView>(R.id.bitmap)
        val bitmap = Bitmap.createBitmap(500, 500, Bitmap.Config.ARGB_8888)
        imgView.setImageBitmap(bitmap)
        val canvas = AndroidCanvas(bitmap)
        canvas.apply {
            drawLine(Point(50f, 60f), Point(300f, 300f), Paint().apply {
                color = fromRGBA(50, 0, 0, 12)
                strokeWidth = 56f
            })
        }
    }
}
