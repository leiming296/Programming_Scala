
class Animal {}

class Bird extends Animal {}

class Consumer1[+T](t: T) { }

// class Test extends App {
val c1: Consumer1[Bird] = new Consumer1[Bird](new Bird)
val c2: Consumer1[Animal] = c1
// }

class Consumer2[-T](t: T) {}

val c3: Consumer2[Animal] =  new Consumer2[Animal](new Animal)
val c4: Consumer2[Bird] =  c3

