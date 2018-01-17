

import ObjectOrientedProgramming.{Address, Person, Employee_2}

val ceoAddress = Address("1 scala Lane", "Anytown", "CA", "98765")

// val buckAddress = Address("98765")

val ceo = Employee_2(
  name = "joe CEO", title ="CEO", age = Some(50),
  address =Some(ceoAddress), manager = None
)

 // val ceoSpouse = Person_2 ("jane smith", address = Some(ceoAddress))

val buck = Employee_2(
  name ="buck trends", title = "zeobie dev", age = Some(20),
  address = Some(ceoAddress), manager = Some(ceo)
)

