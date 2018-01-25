package ErickCommentsFirstWeek

trait Observer[-State] { def receriveUpdate(state: State): Unit}
// the trait for clinets who wanted to be noticed of state change, they must implement receiveUpdate message

trait Subject[State] {
  //  the trait for subjects who will send notification to observers
     private var observers: List[Observer[State]] = Nil
  // a list of observers to notify muttable

    def addObserver(observer: Observer[State]) : Unit =
      observers ::= observer
  // a method to add observers

    def notifyObservers(state: State): Unit =
      observers foreach(_.receriveUpdate(state))
  // a method to notify observers of state changes 
}

