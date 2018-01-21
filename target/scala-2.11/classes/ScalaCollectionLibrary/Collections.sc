
val numbers  = List(1 ,2, 3)

// set need to be unique
Set(1 , 1, 2)

// tuple

 val hostPort = ("localhost", 80)

 hostPort._1
 hostPort._2


// tuple good for pattern matching

hostPort match {
  case ("localhost", port) =>1
  case (host, port) => 0
}

// creat a tuple having two elements ->
val tuplex = 1->2

// Map
Map (1-> "one", 2->"two")
// Map("timesTwo" -> {timesTwo(_}})


// Options is another collection

trait Option[T] {
  def isDefined: Boolean
  def get: T
   def getOrElse(t: T) : T
}

// Map.get use Option as return value

val numbers2 = Map("ones" ->1 , "two" -> 2)
var xx = numbers2.get("two")
numbers2.get("three")

// we want to multiply the number by two, otherwise return 0
val result = if (xx.isDefined) {xx.get*2} else{0}
val result2 = xx.getOrElse(0)*2

val result3 = xx match {
  case Some(n) =>n*2
  case None => 0
}


