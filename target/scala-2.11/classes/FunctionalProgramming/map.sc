

/*
* Maps are used to hold paris of keys and values and they are
* not should be confused withthe map function on many date structures
*
* */

val stateCapitals = Map (
  "Alapha " -> "Montgonery",
  "Alaska" -> "Juneau",
  "Wyoming" ->"Cheyenne"
)

// two ways to define the function passed to map
// take a single tuple argument
val lengths = stateCapitals map {
  kv =>(kv._1, kv._2.length)
}


// Using pattern matching
val caps = stateCapitals map {
  case (k, v) => (k, v.toUpperCase)
}

val stateCapitals2 = stateCapitals + ("virgina" -> "richmond")

//  unlike list, map has immutable and mutable implementations
//  both implementation define + and - operator for adding and removing elements
// and ++ and -- operator for adding and removing elements defined
// in Iterators(sets or list)


