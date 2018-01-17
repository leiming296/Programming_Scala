package Traits.ui2
import Traits.ui.Widget

class Button(val label: String) extends Widget with Clickable {
    protected def updateUI(): Unit = {/* logic to change GUI appearance */}
}
