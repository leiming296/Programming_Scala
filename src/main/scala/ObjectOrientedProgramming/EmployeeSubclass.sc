
import ObjectOrientedProgramming.{Address, Person}

case class Person(name: String, age:Option[Int] = None, address : Option[Address] = None)

class Employee (name: String, age : Option[Int] = None, address: Option[Address]= None,
                val title: String = "[unknown]", val manager: Option[Employee] = None)
  extends Person(name, age, address) {

  override def toString = s"Employee($name, $age, $address, $title, $manager)"

}

val a1 = new Address("1 scala lane", "Anytown", "ca", "98765")

// val a2 = new Address("98765")

val ceo = new Employee("Joe CEO", title = "CEO")

new Employee ("Buck Trends2", Some(20), Some(a1))


new Employee ("Buck Trends2", Some(20),Some(a1), "zobie dev")


new Employee ("Buck Trends2", Some(20), Some(a1), "zobie dev", Some(ceo))