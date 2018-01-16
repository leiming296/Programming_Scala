package ObjectOrientedProgramming

/// case class Address(street: String, city: String, state: String, zip: String)

object PersonEmployeeTraits {
      def apply(zip: String) = new Address("[unknown]", Address.zipTocity(zip),Address.zipToState(zip),zip)

       def zipToCity(zip: String) = "Anytown"
       def ziptoState(zip: String) = "CA"
}

trait PersonState {
  val name: String
  val age: Option[Int]
  val address: Option[Address]
}

case class Person_2 (
     name: String,
     age: Option[Int] = None,
     address: Option[Address] = None)extends PersonState

trait EmployeeState {
     val title : String
     val manager: Option[Employee_2]
}

//case class Employee(
//      name: String,
//      age: Option[Int] = None,
//      address: Option[Address] = None,
//      titile: String = "[unknown]",
//      manager: Option[Employee] = None) extends PersonState with EmployeeState


case class Employee_2(name: String,
                    age: Option[Int] = None,                                           // <7>
                    address: Option[Address] = None,
                    title: String = "[unknown]",
                    manager: Option[Employee_2] = None)
  extends PersonState with EmployeeState