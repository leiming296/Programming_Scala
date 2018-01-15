
val vect1 = Vector("programming", "scala")

val vect2 = "people" +: "should" +: "read" +: vect1

val vect3 ="programming" +: "scala" +: Vector.empty

val vect4 = "people" +: "should" +: "read" +: Vector.empty

val vect5 = vect4 ++ vect3

// get constant-time indexing
vect5(3)











