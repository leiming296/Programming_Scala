
//class Animal {}
//
//class Bird extends Animal {}
//
//class Consumer[-S, +T]()(implicit m1: Manifest[T]) {
//    def m1[U>: T](u: U): T = {m1.runtimeClass.newInstance.asInstanceOf[T]} // 协变，下界
//    def m2[U <: S](s: S)(implicit m2: Manifest[U]) : U = { m1.runtimeClass.newInstance.asInstanceOf[U] } //  逆变，upper bound
//}

class Animal {}
class Bird extends Animal {}
class Consumer[-S,+T]()(implicit m1:Manifest[T]) {
  def m1[U >: T](u: U): T = {m1.runtimeClass.newInstance.asInstanceOf[T]} //协变，下界
  def m2[U <: S](s: S)(implicit m2:Manifest[U]): U = {m1.runtimeClass.newInstance.asInstanceOf[U]} //逆变，上界
}
// class Test extends App {
  val c:Consumer[Animal,Bird] = new Consumer[Animal,Bird]()
  val c2:Consumer[Bird,Animal] = c
  c2.m1(new Animal)
  c2.m2(new Bird)
// }



//class test extends App {
//
//  val c: Consumer[Animal, Bird] = new Consumer[Animal, Bird]()
//
//  val c2: Consumer[Bird, Animal] = c
//
//  c2.m1(new Animal)
//
//  c2.m2(new Bird)
//
//}