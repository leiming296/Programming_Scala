
/**
  * we first declare a class name Greeter with a single method SayHi
  * We then create a new variable named greeter whose Sayhi method we invode
  * In scala we create variable either using the val keyword or the var keyword
  *
  * */
class Greeter {
   def SayHi() = println("hello world")
}

val greeter  =  new Greeter

greeter.SayHi

/***
  * The constructor is the class body and it is parameter list
  * come right after class name.  Therefore, the primary constructor
  * is the entire body of the class.  Any parameter that the constructor requires are listed after class name
  *
  *
  */

class Greeter2(message: String) {
    def SayHi() = println(message)
}

val greeter2 = new Greeter2("Hello World!")
greeter2.SayHi

//  Primary constructor

class Greeter3(message: String, secondaryMessage: String) {
      def SayHi() = println(message + secondaryMessage)
}

val greeter3 = new Greeter3("hello world", "I am a bit more chatty")
greeter3.SayHi

//  Auxiliary constructors

class Greeter4(message: String, secondaryMessage: String){
     def this(message: String) = this(message, "")
     def SayHi() = println(message + secondaryMessage)
}

val greeter4 = new Greeter4("hellow world")
greeter4.SayHi()

//  abstract class

abstract class Greeter5 {
    val message: String
    def SayHi() = println(message)
 }

class SwedishGreeter extends Greeter5 {
     val message = "hey raymond"
}

val greeter5 = new SwedishGreeter
greeter5.SayHi