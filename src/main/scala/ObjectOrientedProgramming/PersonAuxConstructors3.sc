
import ObjectOrientedProgramming.{Address, Person}

import ObjectOrientedProgramming.Person3

val a1 = new Address ("1 scala Lane", "Anytown", "CA", "98765")

//val a2 =  new Address("98776")

Person3("Buck Trends1")

Person3("Buck Trends1", Some(20), Some(a1))

Person3("Buck Trends1", 20, a1)

Person3("Buck Trends", Some(20))

Person3("Buck Trends", 20 )

Person3("Buck Treneds", address = Some(a1))