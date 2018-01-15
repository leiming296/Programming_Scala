
// faceLeft and faceRight functions are associative and commutative
val facLeft = (accum: Int, x: Int) => accum + x

val faceRight = (x: Int, accum: Int) => accum + x

val list1 = List(1,2,3,4,5)

list1 reduceLeft facLeft

list1 reduceRight faceRight

// what if we use a function that is associative, but not communtative

val fncLeft = (accum: Int, x: Int) => accum -x
val fncRight = (x: Int, accum: Int) => accum -x

list1 reduceLeft fncLeft

list1 reduceRight fncRight


// what if we use a function neither associative nor commutative

val fnacLeft = (x: String, y: String) =>s"($x)-($y)"

val fnacRight = (x: String, y: String) =>s"($y)-($x)"

val list2 = list1 map (_.toString)

list2 reduceLeft fnacLeft

list2 reduceRight fnacRight

