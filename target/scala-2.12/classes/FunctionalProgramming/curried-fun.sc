// this method with two argument lists
def cat1(s1: String)(s2: String) = s1 + s2

// a special version that "hello" as the first string
// we can define such a function using partial applicartion
val hello= cat1("hello ")_
// hello is a function, a function of one argument

hello("Raymond")

cat1("hello ")("Raymond")

// partial function take a single argument of some type
val inverse : PartialFunction[Double, Double] = {
  case d if d != 0.0 => 1.0/d
}

inverse(1.0)

inverse(2.0)

val pf1 : PartialFunction[Any, String] = {case s: Int => "Yes"}

pf1(1)

// Any is input type, String is output type

