
import ScalaObjectSystem.ui.Button

import Traits.ui2.{Clickable, ObservableClicks, VetoableClicks}

import Traits.oberver._

val observableButton =
     new Button("Okay") with ObservableClicks with VetoableClicks {
       override val maxAllowed: Int = 2
     }

assert (observableButton.maxAllowed == 2, s"maxAllowed = ${observableButton.maxAllowed}")

class ClickCountObserver extends Observer[Clickable] {
  var count = 0
  def receiveUpdate(state: Clickable) : Unit = count += 1
}

val clickCountObserver = new ClickCountObserver
observableButton.addObserver(clickCountObserver)

val n = 5
for(i <- 1 to n) observableButton.click()

assert(clickCountObserver.count == 2, s"count = ${clickCountObserver.count}. Should be != $n")