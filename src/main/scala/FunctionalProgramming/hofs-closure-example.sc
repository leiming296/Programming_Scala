
var factor = 2

val multiplier= (i :Int) => i*factor

(1 to 10) filter (_%2 == 0) map multiplier reduce (_*_)

factor = 3
(1 to 10) filter (_%2 == 0) map multiplier reduce(_*_)

// note that: multiplier is an anoymous function, as functions
// are first class in scala, we can definne values that are functions
/* Even though multiplier was an immutable function values,
*its behavior changed when factor changed.  here, i is a formal
* parameter which is bound to a new value when multiplier is called
* factor is free variable, a reference to variable in the
* in the enclosing scope. That is
*
* */