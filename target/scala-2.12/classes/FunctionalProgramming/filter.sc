
//  Filtering is common to traverse a collection and extract a new collection
//from it with elements that match certain criteria

val stateCapitals = Map(
  "Alabama" -> "ontgomery",
  "Alaska" -> "Juneau",
  "Wyoming" -> "Cheyenne"
)

val map2 = stateCapitals filter {kv => kv._1 startsWith "A"}

val map3 = stateCapitals.exists (donutName => donutName =="Alabama" -> "ontgomery" )

val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")

val doesPlainDonutExists: Boolean = donuts.exists(donutName => donutName == "Plain Donut")