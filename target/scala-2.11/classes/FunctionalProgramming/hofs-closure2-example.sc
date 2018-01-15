
def m1(multiplier: Int=>Int) = {
  // val factor =1  doest now work as m2 is a closure
  (1 to 10) filter (_%2==0) map multiplier reduce (_*_)
}

// m2 return a function value of type Int =>Int
// The function returend by m2is a closre that encapulates a reference to factor
def m2 : Int => Int = {
  val factor = 2
  val multiplier = (i: Int) => i*factor
  multiplier
}


m1(m2)
