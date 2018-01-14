
import scala.annotation.tailrec

// what happens if you uncomment the annotation
//@tailrec
def factorial(i:BigInt) : BigInt= {
  if(i == 1) i
  else i*factorial(i-1)
}

for (i <- 1 to 10) println(s"$i:\t${factorial(i)}")


/*
* Recursion is the pure way to implement "looping" because you cannot
* have mutable loop counters.
* Recursion is also most natural way to express some functions
*
* */