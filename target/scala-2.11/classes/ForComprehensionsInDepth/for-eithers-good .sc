
// Either is container, hold either an error indicator or a value
// the left value is used to hold the error, such as a message string
// or even an exception thrown by a libary, and the normal return value is returned
// as a Right
def postive(i: Int): Either[String, Int] = {
  if (i > 0 ) Right(i) else Left(s"nonpostive number $i")
}

for {
      i1 <- postive(1).right
      i2 <- postive(10*i1).right } yield (i1+ i2)

for {
   i1  <- postive(1).right
   i2  <- postive(-1*i1).right
} yield(i1 + i2 )

postive(-5)
postive(1)

//  declare two either[String, Int] values and assign a Left[String]
// to the first and a Right[Int] to the second

val l :Either[String, Int] = Left("boo")

val r: Either[String, Int] = Right(12)


val l1 : Either[String, Int] = Left("boo")
val r1: String Either Int = Left("boohoo")

type Or[A,B] = Either[A,B]
// val l3: String or Int = Left("better?")

l.left  map(_.length)
r.left.map(_.size)

l.right map(_.toDouble)
r.right  map(_.toDouble) 