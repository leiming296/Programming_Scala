package ScalaObjectSystem.ui

import Traits.ui2.Clickable

class Button (val label: String) extends Widget with Clickable {
     def draw() :Unit =println(s"Drawing : $this")  // override keyword is an option here

  //  From clickable
     protected def updateUI(): Unit = println(s"$this clicked; updating UI")

     override def toString() = s"(button: label = $label, ${(super.toString)})"

}


//abstract class Widget {
//  def draw(): Unit
//  override def toString() ="(widget)"
//}

//trait Clickable {
//  def click() : Unit = updateUI()
//
//  protected def updateUI(): Unit
//}
