
import scalaz._
import std.AllInstances._
 /** validate a user' name, nonempty and alphabetic characters */

def validName(key: String, name: String) :
     Validation[List[String], List[(String, Any)]] = {
  val n = name.trim // remove whitespace
  if(n.length >0 && n.matches(""" ^\p{Alpha}$""")) Success(List(key -> n))
  else Failure(List(s"Invalid $key <$n>"))
}


/** validate that the string is an interger and greater than zero */

def positive (key: String, n: String):
   Validation[List[String], List[(String, Any)]] = {
  try {
    val i = n.toInt
    if(i>0) Success(List(key ->i))
    else Failure(List(s"Invalid $key $i"))
  } catch {
    case _: java.lang.NumberFormatException =>
    Failure(List(s"$n is not an integer"))
  }
}

def validateForm(firstName: String, lastName: String, age: String):
    Validation[List[String], List[(String, Any)]] = {
  validName("first-name", firstName) +++ validName ("last-name", lastName) +++ positive("age", age)
}

validateForm("Dean", "Wampler", "29")