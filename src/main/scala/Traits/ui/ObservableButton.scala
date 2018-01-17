package Traits.ui

import Traits.oberver.Subject

class ObservableButton (name: String)   // A subclass of Button that mixed in observability
  extends Button(name) with Subject[Button] {  // extends Button and mixes in subject and uses Button as the subject type parameter

  override def click() : Unit = {  // have to override the click method.  all would require overrides if there were other state-chaning methods
              super.click()    // call the parent class click to perform the normal GUI update logic
             notifyObservers(this)  // notify the observers passing this as the state
      }
}
