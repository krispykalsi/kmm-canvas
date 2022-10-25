package com.krispykalsi.helloworld.core

import android.graphics.Color


actual typealias Color = Int

actual fun fromARGBHex(argb: Int) = argb

actual fun fromRGBA(r: Int, g: Int, b: Int, a: Int) = Color.argb(a, r, g, b)