
import scala.util.control.TailCalls._

def isEven(xs: List[Int]) : TailRec[Boolean] =
    if(xs.isEmpty) done(true) else tailcall(isOdd(xs.tail))

def isOdd(xs: List[Int]): TailRec[Boolean] =
    if(xs.isEmpty) done(false) else tailcall(isEven(xs.tail))

for(i <- 1 to 5) {
  val even = isEven((1 to i).toList).result
  println(s"$i is even? $even")
}

/*
* the code bounces back and forth for each element until the end of the list
*
* */