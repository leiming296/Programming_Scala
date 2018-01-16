import ObjectOrientedProgramming.{Address, Person}

val a1 = new Address("1 scala lane", "anytown", "CA", "98765")
// val a2 = new Address("98765")

case class Person2(name: String, age: Option[Int] = None, address: Option[Address] = None)

new Person2("Buck Trends")

new Person2("Buck Trends", Some(20), Some(a1))

new Person2("Buck Trends", Some(20))

new Person2("Buck Trends", address = Some(a1))