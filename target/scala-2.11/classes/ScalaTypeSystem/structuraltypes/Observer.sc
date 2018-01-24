
import ScalaTypeSystem.structuraltypes.Subject
import scala.language.reflectiveCalls

object observer {
    def receiveUpdate(state: Any) : Unit= println("got one" + state)
}

val subject = new Subject {
    type State = Int
    protected var count = 0
    def increment() : Unit = {
        count += 1
        notifyObservers(count)
    }
}

subject.increment()
subject.increment()
subject.addObserver(observer)
subject.increment()
subject.increment()



