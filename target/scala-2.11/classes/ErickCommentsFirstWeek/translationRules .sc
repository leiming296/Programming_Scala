
val states = List("Alabama", "Alaska", "Virginia", "Wyoming")

// pat <- expr
// pat  <- expr.withFilter{ case pat => True, case_=>false}
for {s <- states } yield s.toUpperCase
for {s <-  states.withFilter { case p => true; case _ => false }} yield s.toUpperCase

// for {pat <- expr1} yield expr2
// expr map {case pat => expr2}
states map {case s => s.toUpperCase}

// for (pat <- expr1) expr2 ......for loop
// expr foreach {case pat => expr2}
for (s <- states) println(s.toUpperCase)
states foreach { case s => println(s.toUpperCase)}

// pat1 <-expr 1 ; pat

val z@ (x, y) = (1 ->2 )

val map = Map("one" ->1, "two" -> 2)

val list1 = for {
  (key, value) <- map
  i10 = value + 10
} yield(i10)

// translation
val list2 = for {
  (i, i10) <- for {
    x1@(key, value) <- map
  } yield {
    val x2@i10 = value +10
    (x1, x2)
  }
} yield(i10)