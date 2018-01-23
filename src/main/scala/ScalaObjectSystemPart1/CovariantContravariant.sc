
class Animal {}

class Bird extends Animal {}

//class Consumer[T](t:T) {}
// c不能赋值给c2，因为Consumer定义成不变类型。


class Consumer[+T](t:T) {}
// 因为Consumer定义成协变类型的，所以Consumer[Bird]
// 是Consumer[Animal]的子类型，所以它可以被赋值给c2。

//class Test extends App {
    val c1: Consumer[Bird] = new Consumer[Bird](new Bird)
    val c2: Consumer[Animal] = c1
//}


// Scala 逆变

// class Hummingbird extends Bird {}

//class Bird2 extends Hummingbird {}

// class Consumer2[-T](t: T) {}

class Contravariant[-T](t: T) {}

//class Test2 extends App {
     val c3:  Contravariant[Animal] = new Contravariant[Animal](new Animal)
     val c4: Contravariant[Bird] =c3
//}

//这里Contravariant[-T]定义成逆变类型，所以Contravariant[Animal]
// 被看作Contravariant[Bird]的子类型，故c可以被赋值给c2。