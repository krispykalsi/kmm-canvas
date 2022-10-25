package com.krispykalsi.helloworld.core

import android.graphics.Paint

fun com.krispykalsi.helloworld.core.Paint.toPaint() = Paint().apply {
    color = this@toPaint.color
    strokeWidth = this@toPaint.strokeWidth
}
