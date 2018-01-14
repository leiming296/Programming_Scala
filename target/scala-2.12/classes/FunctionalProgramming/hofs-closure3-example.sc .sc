

// defined an anonymous function multiplier as a value
//val factor = 2
//val multiplier = (i: Int) => i*factor

object Multiplier {
  var factor =2
  // compare: val multiplier = (i： Int) = i*factor
  def multiplier(i: Int) = i *factor
}

(1 to 10) filter (_%2==0) map Multiplier.multiplier reduce (_*_)

Multiplier.factor = 3

(1 to 10 ) filter (_%2 == 0) map Multiplier.multiplier reduce (_*_)

/*
* multiplier is now a method. However, we use it just like a function
* because it does not reference this. When a method is used where a function
* is required.  we say Scala lifts the method to be a function
*
*
* */