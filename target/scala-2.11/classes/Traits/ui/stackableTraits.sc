import Traits.oberver.Observer

trait Clickable{
  def click(): Unit = updateUI()
  protected def updateUI(): Unit
}

abstract class Widget

class Button(val label: String) extends Widget with Clickable{
  protected def updateUI(): Unit = {/* logic to change GUI appearance */}
}


trait Subject[State] {                                               // <2>
  private var observers: List[Observer[State]] = Nil                 // <3>

  def addObserver(observer:Observer[State]): Unit =                  // <4>
    observers ::= observer                                           // <5>

  def notifyObservers(state: State): Unit =                          // <6>
    observers foreach (_.receiveUpdate(state))
}


trait ObservableClicks extends Clickable with Subject[Clickable] {
  abstract override def click() : Unit = {
    super.click()
    notifyObservers(this)
  }
  
}