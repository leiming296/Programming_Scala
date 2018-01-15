
val results: Seq[Option[Int]] = Vector(Some(10), None, Some(20))

val results2 = for {
  Some(i) <- results
} yield (2*i)

// Work through the translation rules
val results2b = for {
  Some(i) <- results withFilter {
    case Some(i) => true
    case None => false
  }
} yield (2*i)

// Convertfor {x <- y} yield (z) expression to a map
val result2c = results withFilter {
  case Some(i) => true
  case None => false
} map {
  case Some(i) => (2*i)
}

