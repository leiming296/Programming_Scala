
val seq1 = Seq("programming", "scala")

val seq2 = "people" +: "should" +: "read" +: seq1

val seq3 = "programming" +: "scala" +: Seq.empty

val seq4 = "people" +: "should" +: "read" +: Seq.empty

val seq5 = seq3 ++ seq4

/*
* note that, we defined an empty tail using Seq.empty
* most of collections have companion objects with empty method
* for creating an empty instance of the collections, like Nil for list
*
*
*
 */

/*
*  what is different between +: and :+
*  just recall : will always be on the side of the colections
*  list :+ x and x+:list
* */

val seq11 = seq1 :+ "rcocks"

/*
* Scala only defines an immutable list,however, it also defines some multable
* list types like ListBuffer and MutableList
* */


