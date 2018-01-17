
trait Philosophical {
  def philosophize(): Unit = {
    println("I am raymond, and working hard")
  }
}

class Frog extends Philosophical {
   override def toString = "gree"
}

// using extends add the trait of Philosophical into Frog

val frog = new Frog


frog.philosophize


val phil: Philosophical = frog


phil.philosophize


class Animal

class Frog2 extends Animal with Philosophical {
  override def toString = "green"
}

trait HasLegs

class Frog3 extends Animal with Philosophical with HasLegs{
  override def toString = "green"
}


