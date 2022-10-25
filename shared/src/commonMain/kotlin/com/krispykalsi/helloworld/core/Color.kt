package com.krispykalsi.helloworld.core


expect class Color

expect fun fromARGBHex(argb: Int): Color

expect fun fromRGBA(r: Int, g: Int, b: Int, a: Int): Color