
import scalaz._, std.AllInstances._

//  like either, the first of the two type parameters is the type used to
// to report errors, here we used a List[String], so we can
// accumulate multipe errors.
//  The second type parameter is for the result returned if validation succeeds

def positive(i: Int): Validation[List[String], Int] = {
  if(i>0) Success(i)
  else Failure(List(s"Nonpostive integer $i"))
}

//positive(5)+++positive(10)+++positive(25)

for{
  i1 <- positive(5)
  i2 <- positive(10*i1)
  i3 <- positive(25*i2)
  i4 <- positive(2*i3)
} yield (i1 + i2 + i3 + i4 )




for {
  i1 <- positive(5)
  i2 <-positive(-1*i1)
  i3 <-positive(25*i1)
  i4 <-positive(-2*i1)
} yield (i1 + i2 + i3 + i4)

// positive(5) +++ positive(10)

positive(5)+++positive(10)+++positive(25)


positive(5)+++positive(-10)+++positive(25) +++ positive(-30)
