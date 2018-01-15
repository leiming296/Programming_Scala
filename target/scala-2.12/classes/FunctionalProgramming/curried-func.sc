
// curring transforms a function that takes multiple arguments into
//a chain of functions each taking a single argument
def cat1(s1: String)(s2: String) = s1+ s2

// def cat2(s1 :String) = (s2：String) => s1 + s2

def cat2(s1: String) = (s2: String) => s1 +s2

val cat2hello = cat2("Hello ")

cat2hello("world")

cat1("hello ")("world")

cat2("hello ")("world")


//  we can also convert methods that take multiple arguments
// into a curried form with the curried method

def cat3(s1: String, s2: String) = s1 + s2

cat3("hello ", "world")

val cat3Curried = (cat3 _).curried

cat3Curried("hello ")("world")



//  we can uncurry a function

val cat3Uncurried = Function.uncurried(cat3Curried )

cat3Uncurried("hello ", "world")