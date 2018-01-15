
val states = List("Alazbama", "Alaska", "Virginia", "Wyoming")

for{ s <- states} println(s)

states foreach println
states.foreach {s => println(s)}
// states foreach {_.toUpperCase()} // can not return a collection

// what happends if we use yield

for {
  s <- states
} yield s.toUpperCase

// yield method can produce a collection

// use the map method

states map {_.toUpperCase}
states.map {_.toUpperCase}
///// for-flatmap

for {s <-states
c <- s } yield s"c-${c.toUpper}"

states flatMap (_.toSeq map (c=> s"c-${c.toUpper}"))

//  states.toSeq


// flatten

List(List(1,2,3), List(2,4)).flatten

// flatmap  combine flatten and map together

List(List(1,2,3), List(2,4)).flatMap{x=>x.map(x => 2*x)}

