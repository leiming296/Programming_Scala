package Traits.ui

class Button(val label: String) extends Widget{

  def click() : Unit = updateUI()
  def updateUI() : Unit = { /* logic to change GUI appearance */}

}
