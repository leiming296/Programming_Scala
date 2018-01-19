
case class Person(name:String, age: Int)

val p : Product = new Person("Dean",29)

p.productArity

p.productElement(0)

p.productElement(1)

p.productIterator foreach println

val t2 = ("Dean", 29)

t2._1
t2._2

