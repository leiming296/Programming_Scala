
//  Value types refers to all the different forms these types
// may take

// value types include parametrized types, singleton types, type
// projections, type designators, compound types, existential types
// tuple types, function types and infix type

// tuple types

val t1: Tuple3[String, Int, Double] = ("one", 1, 2.0)

val t2: (String, Int, Double) = ("one", 1 , 2.0)

// function types

val f1: Function2[Int, Double, String] = (i, d) =>s"int $i, double $d"

val f2: (Int, Double) => String = (i, d) =>  s"$i, double $d"

