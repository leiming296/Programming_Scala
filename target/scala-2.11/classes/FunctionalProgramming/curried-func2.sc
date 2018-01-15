
val f1: String => String => String =
  (s1:String) =>(s2: String) =>s1+ s2

val f2: String => (String => String) =
  (s1: String) => (s2: String) =>s1 +s2

f1("hello")("world")
f2("hello")("world")

// from that, we can see the type signature String => String=>String
//is equivalent to string => (String =>String)
// Calling f1 and f2 with an argument binds the first
 // argument and returnsa new function of type string String => String

// we can uncurry function

val f3 = Function.uncurried(f2)

f3("hello ", "world")

// specialized forms of a base function that handles multiplication
def multiplier(i: Int)(factor: Int)  = i*factor

val byFive = multiplier(5)_

val byTen = multiplier(10)_

byFive(2)

byTen(2)

// three-element tuple and you need to call a three argument function

def mult(d1: Double,d2: Double,d3: Double) = d1*d2*d3

val d3 = (2.2, 3.3,4.4)

mult(d3._1, d3._2, d3._3)

// we would like to have a version of mult that take tuple itself
val multTupled = Function.tupled(mult _)
multTupled(d3)
val unmultTupled = Function.untupled(multTupled)
unmultTupled(d3._1, d3._2, d3._3)










