
import scala.util.{Try, Success, Failure}

def positive(i: Int) : Try[Int] = Try {
   assert (i>0, s"nonpositive number $i")
  i
}
for {
  i1 <- positive(5)
  i2 <- positive(10*i1)
} yield (i1 +i2 )

for {
  i1 <-positive(5)
  i2<- positive(-1*i1)
} yield (i1 + i2 )

// A more explicit defintion of positive

//def positive(i: Int) : Try[Int] =
//  if(i>0) Success(i)
//  else Failure(new AssertionError("assertion failed"))

for {
  i1 <- positive(5)
  i2 <- positive(10*i1)
} yield (i1 +i2 )

for {
  i1 <-positive(5)
  i2<- positive(-1*i1)
} yield (i1 + i2 )