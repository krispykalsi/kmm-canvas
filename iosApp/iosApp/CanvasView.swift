//
//  ViewController.swift
//  iosApp
//
//  Created by Ikroop Singh Kalsi on 06/06/22.
//  Copyright © 2022 orgName. All rights reserved.
//

import SwiftUI
import shared

struct CanvasView: UIViewRepresentable {
    func makeUIView(context: Context) -> UIImageView {
        let imgView = UIImageView()
        let renderer = UIGraphicsImageRenderer(bounds: CGRect(x: 0, y: 0, width: 400, height: 500))
        let img = renderer.image { ctx in
            let paint = Paint()
            paint.color = ColorKt.fromRGBA(r: 50, g: 0, b: 0, a: 12)
            paint.strokeWidth = 56
            let canvas = IOSCanvas(context: ctx)
            canvas.drawLine(start: Point(x: 20, y: 30),
                            end: Point(x: 300, y: 400),
                            paint: paint)
        }
        imgView.image = img
        return imgView
    }
    
    func updateUIView(_ uiView: UIImageView, context: Context) {}
}
