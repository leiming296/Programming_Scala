package Traits.ui2

import Traits.oberver._

trait ObservableClicks extends Clickable with Subject[Clickable] {
      abstract override def click() :Unit = {
        super.click()
        notifyObservers(this)
      }
}
