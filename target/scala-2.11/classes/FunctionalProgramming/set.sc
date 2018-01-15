
// sets are an example of unordered collections, so they are not
//are not sequences, but require each element to be unique
val states = Set("Alabama", "Alaska", "Wyoning")

val lengths = states map(st =>st.length)

val states2 = states + "virginia"

val states3 = states2 + ("new work", "Illinois")



