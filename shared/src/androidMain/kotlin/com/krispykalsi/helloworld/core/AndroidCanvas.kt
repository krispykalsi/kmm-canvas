package com.krispykalsi.helloworld.core

import android.graphics.Bitmap
import android.graphics.Canvas

class AndroidCanvas(bitmap: Bitmap) : com.krispykalsi.helloworld.core.Canvas {
    private val canvas = Canvas(bitmap)

    override fun drawLine(start: Point, end: Point, paint: Paint) =
        canvas.drawLine(
            start.x, start.y,
            end.x, end.y,
            paint.toPaint()
        )
}