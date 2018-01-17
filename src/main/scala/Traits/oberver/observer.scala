//package Traits
//
//
//trait Observer[-State] {
//  def receiveUpdate(state: State) : Unit
//}
//
//trait Subject[State] {
//  private var observers: List[Observer[State]] = Nil
//
//  def addObserver(observer: Observer[State]): Unit =observers ::= observer
//
//  def notifyObserver(state: State) : Unit = observers foreach(_.receiveUpdate(state))
//}


package Traits.oberver

trait Observer[-State] {                                             // <1>
  def receiveUpdate(state: State): Unit
}

trait Subject[State] {                                               // <2>
  private var observers: List[Observer[State]] = Nil                 // <3>

  def addObserver(observer:Observer[State]): Unit =                  // <4>
    observers ::= observer                                           // <5>

  def notifyObservers(state: State): Unit =                          // <6>
    observers foreach (_.receiveUpdate(state))
}


// trait PureAbstractionTrait {
//      def abstractMember(str: String) : Int }

// abstract class AbstractClass {
//    def concreteMember(str: String) : Int = str.length
//    def abstractMember(str: String) :Int }

/**
  * Traits with abstract memebers do not have to be declared abstract by adding the abstract keyword before the trait keyword
  * However, classes that are abstract where one or more memeber is undefined must be declared abstract
  *
  * */