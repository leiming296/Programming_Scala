
// Map works by applying a function to each  element in the list
val  l = List(1, 2, 3, 4, 5)

l.map(x=>x*2)

def f(x: Int) = if (x > 2) Some(x) else None

l.map(x => f(x))


//  flatMap works applying a function the return a sequence for each element
// in the list, and flttening the results into the original list

def g(v: Int) = List(v-1, v, v+1)

l.map(x => g(x))
// res2: List[List[Int]] = List(List(0, 1, 2), List(1, 2, 3),
// List(2, 3, 4), List(3, 4, 5), List(4, 5, 6))
l.flatMap(x => g(x))
// res3: List[Int] = List(0, 1, 2, 1, 2, 3, 2, 3,
// 4, 3, 4, 5, 4, 5, 6)

// this comes in really useful with built in Option class
// because an option can be consider a sequence that is either
// empty or has 1 item

l.map(x => f(x))
// res4: List[Option[Int]] = List(None, None, Some(3), Some(4), Some(5))

l.flatMap(x => f(x))
// res5: List[Int] = List(3, 4, 5)

/**
  *  a generalization of the map operation is flatMap, where  we generated zero to many new elements
  *  for each element in the original collection.  We pass a function that returns a collection, instead of elements
  *   and flatens the generated collections into one collection
  *
  * */
val list = List("now", "is", "", "the", "time")
list flatMap(  s => s.toList )
// calling toList on each string creats a List[char].  These nested lists are then flattened into
// the final list[char]