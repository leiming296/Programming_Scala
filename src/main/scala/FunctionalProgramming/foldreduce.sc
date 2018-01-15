
val list = List(1,2,3,4,5,6)

list reduce (_+_)

list.fold(1)(_+_)

(list fold 10) (_+_)

// (list reduce 10)

// fold expression requires two argument lists, the seed value
// and the function to compute the results

// created fold1 using partial application, then applying
//the remaining argument list (_*_)
val fold1 = (list fold 10)_

fold1(_+_)

(List.empty[Int]  fold 10)(_+_)

// List.empty[Int] reduce(_+_)
// reduce cannot work on empty collection, because there would be nothing to return

List.empty[Int] reduceOption   (_+_)

List(1,2,3,4) reduceOption (_+_)

val list2= List(1,2,3,4,5)
(list2 scan 10)(_+_)

list2.mkString
list2.mkString(",")

list2.product

