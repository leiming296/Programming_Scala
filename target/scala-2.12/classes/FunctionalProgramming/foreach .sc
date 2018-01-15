
// the standard traversal method for scala containers
// The output of foreach is unit, as it takes a function argument
// foreach is a higher-order function

List(1,2,3,4,5)foreach(i=>println("Int: " + 2*i))

val stateCapitals =Map(
  "alabama" -> "montgomery",
  "alaska" -> "juneau",
  "wyoming" -> "cheryeme"
)

stateCapitals foreach {case (a, b) => println(a + " : " + b)}

List(1,2,3,4,5) map( i => 2*i)

stateCapitals map (kv => (kv._1 , kv._2.length))



