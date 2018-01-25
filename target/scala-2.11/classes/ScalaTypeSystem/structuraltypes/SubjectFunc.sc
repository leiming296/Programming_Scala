
import ScalaTypeSystem.structuraltypes.SubjectFunc

val observer: Int => Unit = (state: Unit) => println("got one!" + state)

// val subject = new SubjectFunc {...}