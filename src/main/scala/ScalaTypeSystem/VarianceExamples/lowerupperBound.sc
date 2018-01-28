
class Animal {}

class Bird extends Animal {}

class Consumer3[+T](t: T) {
  //  def use(t: T) = {}
  def use[U >: T](u : U) = {println(u)}
}

class Consumer4[-T](t: T) {
  def get[U <: T](u: U ) = {println(u)}
}

class Consumer5[-S,+T]() {
  def m1[U >: T](u: U): T = {new T} //Covariant, lower bounds
  def m2[U <: S](s: S): U = {new U} //Contravariant，upper bounds
}

  val c5:Consumer5[Animal,Bird] = new Consumer5[Animal,Bird]()
  val c6:Consumer5[Bird,Animal] = c5
  c5.m1(new Animal)
  c6.m2(new Bird)
