
//  a type take two type parameters can be written in infix lile Either[A,B]

val xll1: Int Either Double Either String = Left(Left(1))

val xl12: (Int Either Double) Either String = Left(Left(1))

val xlr1: Int Either Double Either String = Left(Right(3.14))

val xlr2: (Int Either Double) Either String = Left(Right(3.14))


val xr1: Int Either Double Either String = Right("foo")

val xr2: (Int Either Double) Either String = Right("foo")

val x1: Int Either (Double Either String) = Left(1)

val xr11: Int Either (Double Either String) = Right(Left(3.14))

val xr111: Either[Int, Either[Double, String]] = Right(Right("bar!"))

