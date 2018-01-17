package Traits.ui2

import Traits.oberver._

trait VetoableClicks extends Clickable {
   val maxAllowed = 1
   private var count = 0

   abstract override def click() = {
          if (count < maxAllowed) {
            count += 1
            super.click()
          }
   }

}
