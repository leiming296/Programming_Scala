
 class Name(var value: String)

//class Name(s: String) {
//  private var _value: String = s
//  def value: String =_value
//  def value_ = (newValue: String) : Unit = _value = newValue
//}

val name = new Name("Buck")

name.value

// name.value_ = ("Bubba")

name.value = "Hank"

name.value


 class Name2(s: String) {
   var value: String =s
 }

 val name2 = new Name2("Buck")
 name2.value

 name2.value = ("Buba")






