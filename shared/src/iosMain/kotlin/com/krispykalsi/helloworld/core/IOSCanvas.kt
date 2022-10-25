package com.krispykalsi.helloworld.core

import platform.CoreGraphics.*
import platform.UIKit.UIGraphicsImageRendererContext

class IOSCanvas(private val context: UIGraphicsImageRendererContext): Canvas {
    override fun drawLine(start: Point, end: Point, paint: Paint) {
        paint.apply {
            color.setStroke()
            CGContextSetLineWidth(context.CGContext, strokeWidth.toDouble())
        }
        CGContextBeginPath(context.CGContext)
        CGContextMoveToPoint(context.CGContext, start.x.toDouble(), start.y.toDouble())
        CGContextAddLineToPoint(context.CGContext, end.x.toDouble(), end.y.toDouble())
        CGContextClosePath(context.CGContext)
        CGContextStrokePath(context.CGContext)
    }
}
