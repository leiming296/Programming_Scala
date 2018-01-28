
trait Parent[T <: Parent[T]] { def make: T}

case class Child1(s: String) extends Parent[Child1]{
     def make: Child1 = Child1(s"Child1: make: $s")
}

case class Child2(s: String) extends Parent[Child2] {
    def make: Child2 = Child2(s"Child2: make: $s")
}

val c1 = Child1("c1")

val c2 = Child2("c2")

val c11 = c1.make

val c22 =c2.make

val p1: Parent[Child1] = c1

val p2: Parent[Child2] = c2

val p11 = p1.make

val p22 = p2.make

