
import ScalaObjectSystem.ui.{Button, Widget}
import Traits.ui2.Clickable

val b = new Button("Submit")

b.draw()

b.toString


//
//class Button (val label: String) extends Widget with Clickable {
//  def draw() :Unit =println(s"Drawing : $this")  // override keyword is an option here
//
//  //  From clickable
//  protected def updateUI(): Unit = println(s"$this clicked; updating UI")
//
//  override def toString() = s"(button: label = $label, ${(super.toString)})"
//
//}