
val states = List("ALask", "Virginia")

for {
  s <-states
  c <- s if c.isLower
} yield s"c-${c.toUpper}"

states flatMap (_.toSeq withFilter (_.isLower) map (c=>s"c-${c.toUpper}"))

// states.toSeq


//  for variables

for {
  s <- states
  c <- s if c.isLower
  c2 = s"$c-${c.toUpper}"
} yield c2

states flatMap (_.toSeq withFilter (_.isLower) map {
  c => val c2 = s"c-${c.toUpper}"
    c2
})

states.flatten