
class Covariant[+A]

val cv: Covariant[AnyRef] = new Covariant[String]

// val cx: Covariant[String] = new Covariant[AnyRef]
// error: typo mismatch
// found: Covariant[AnyRef]
//required: Covariant[String]

class Contravariant[-A]

val cx: Contravariant[String] = new Contravariant[AnyRef]

//val cy: Contravariant[AnyRef] = new Contravariant[String]
// type mismatch
// found: Contravariant[String]
// required: Contravariant[AnyRef]

trait Function1[-T1, +R] extends AnyRef

class Animal {val sound = "rustle"}

class Bird extends Animal {override val sound = "call"}

class Chicken extends Bird {override val sound = "cluck"}

//val getTweet: (Bird => String) = ( (a：Animal)=> a.sound )

val getTweet: (Bird => String) = ((a: Animal) => a.sound )

val hatch: (() => Bird) = (() => new Chicken )

