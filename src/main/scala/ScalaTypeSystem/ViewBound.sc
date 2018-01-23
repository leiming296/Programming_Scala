import scala.language.implicitConversions

class Bird{def sing = {}}

class Toy {}

class Consumer[T <% Bird]() {
    def use(t: T) =t.sing
}

//val consumerEx = new Consumer
//consumeEx.use

class Consumer2() {
  def use[T <% Bird](t: T) = t.sing
}

//class Test extends App {
//     val c   = new Consumer()
//      val c2 = new Consumer2()
//      c.use(new Toy)
//      c2.use(new Toy)
//}

class Test2 extends App {
    implicit def toy2Bird(t: Toy) = new Bird
    val c3 = new Consumer2()
    c3.use(new Toy)
}