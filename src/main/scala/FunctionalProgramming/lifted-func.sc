// there are transformations between partial functions
// and functions that return options
val finicky: PartialFunction[String, String] ={
  case "finicky" => "FINICKY"
}

finicky("finicky")

// finicky("other")

val finickyOption = finicky.lift

finickyOption("finicky")

finickyOption("other")

val finickyOption2 = Function.unlift(finickyOption)

finickyOption2("finicky")

// finickyOption2("other")
/*
* If we have a partial function and we do not like
* the idea of an exception being thrown, we can lift the function
* into one that returns an option
*
* */

