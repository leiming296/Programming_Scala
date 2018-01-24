
abstract class SubjectObserver {
    type S <: Subject
    type O <: Observer

   trait Subject {
      private var observers = List[O]()
      def notifyObservers() = observers.foreach(_.receiveUpdate(this))
   }

   trait Observer {
     def receiveUpdate(subject: S)
   }

}