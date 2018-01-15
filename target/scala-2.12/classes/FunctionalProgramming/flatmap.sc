
val list = List("now", "is", "", "the", "time")

list flatMap(s =>s.toList)


// Calling toList on each string creates a List[Char]
// these nested lists are flattened int the final List[Char]

val list2 = List("now", "is", "", "the", "time") map (s => s.toList)

list2.flatten




