
import scala.language.implicitConversions

class Bird {def sing = {}}

class Toy {}

class Consumer() {

  def use[T <% Bird](t: T) = t.sing

}

//class Test extends App {

//  implicit def toy2Bird(t: Toy) = new Bird
//
//  val c = new Consumer()
//
//  c.use(new Toy)
//
//}

