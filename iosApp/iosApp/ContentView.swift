import SwiftUI
import CoreGraphics
import shared

struct ContentView: View {
	var body: some View {
        VStack {
            CanvasView()
        }
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}
