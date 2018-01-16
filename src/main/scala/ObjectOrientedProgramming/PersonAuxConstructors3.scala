package ObjectOrientedProgramming

import ObjectOrientedProgramming.{Address, Person}

case class Person3(name: String, age: Option[Int]= None, address: Option[Address] = None)

object Person3 {
  def apply(name:String, age: Int) : Person3 = new Person3(name, Some(age))

  def apply(name: String, age: Int, address: Address) : Person3=
    new Person3(name, Some(age), Some(address))

  def apply(name: String, address: Address) : Person3 =
    new Person3(name, address=Some(address))
}

