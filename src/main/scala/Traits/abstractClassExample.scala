package Traits

object abstractClassExample {
  def main(args: Array[String]): Unit = {
    val teacher = new TeacherMaths("spark")
    teacher.teach
    println("teacher.id" + teacher.id)
    println(teacher.name + " " + teacher.age)
  }
 }

abstract class SuperTeach(val name: String) {  // declare  an abstract class
  var id: Int  //  no value, abstract
  var age: Int
  def teach   // no need for method body

}

class TeacherMaths(name: String) extends SuperTeach(name) {
  override var id = name.hashCode()   // override show this variable from parent class
  var age = 20
  override def teach = println("teaching!")

}


