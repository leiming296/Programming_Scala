
// import Traits._
import Traits.oberver._
import Traits.ui.{Button, ObservableButton}

class ButtonCountObserver extends Observer[Button] {
     var count = 0
     def receiveUpdate(state: Button) : Unit = count +1
}

val button = new ObservableButton("click me")

val bco1 = new ButtonCountObserver

val bco2 = new ButtonCountObserver

button addObserver bco1
button addObserver bco2

(1 to 5 ) foreach (_=> button.click())

assert(bco1.count == 5)
assert(bco2.count == 5)

