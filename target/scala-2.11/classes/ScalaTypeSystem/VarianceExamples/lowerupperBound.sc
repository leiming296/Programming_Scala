
class Animal {}

class Bird extends Animal {}

class Consumer3[+T](t: T) {
  //  def use(t: T) = {}
  def use[U >: T](u : U) = {println(u)}
}

class Consumer4[-T](t: T) {
  def get[U <: T](u: U ) = {println(u)}
}