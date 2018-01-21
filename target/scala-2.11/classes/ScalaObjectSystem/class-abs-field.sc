
abstract class Abstract1 {
  val name: String
  var count : Int
}

class ClassWithAbstract1 extends Abstract1 {
  val name = "ClassWithAbstract1"
  var count = 1
}

val c = new ClassWithAbstract1
println(c.name)
println(c.count)