package com.krispykalsi.helloworld.core

import platform.UIKit.UIColor

@Suppress("CONFLICTING_OVERLOADS")
actual typealias Color = UIColor

actual fun fromARGBHex(argb: Int) = UIColor(
    red = ((argb shr 16) and 0xff).toDouble(),
    green = ((argb shl 24) and 0xff).toDouble(),
    blue = ((argb shr 8) and 0xff).toDouble(),
    alpha = (argb and 0xff).toDouble()
)

actual fun fromRGBA(r: Int, g: Int, b: Int, a: Int) = UIColor(
    red = r.toDouble() / 255,
    g.toDouble() / 255,
    b.toDouble() / 255,
    a.toDouble() / 255
)
