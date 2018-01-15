
object Combinators {
  def map[A,B](f: (A) =>B)(list: List[A]) : List[B] = list map f
}

// Int => String
// define a function and it knows nothing about lists
val intToString = (i: Int) => s"N=$i"

//define a new function List[Int]=>List[String]
val flist = Combinators.map(intToString)_

// we used map to lift a function of type Int => String
// to a function of type List[Int] => List[String]
val list = flist(List(1,2,3,4))


/*
* Think map as transforming a collection with elements of type A into
* a collection of type B, using function f : A =>B that knows nothing about the collection
* .
* View map as a tool to lift  an ordinary function f: A=>B to
* a new function flist: List[A] => List[B]
*
*
* */

