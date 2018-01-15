
def addInts(s1: String, s2: String) : Int =
    s1.toInt + s2.toInt

for {i <- 1 to 3
    j <- 1 to i } println(s"$i+$j = ${addInts(i.toString, j.toString)}")

// addInts("0", "x")

// Either restores referential transparency and indicates
// through the type signature that errors can occur

def addInts2 (s1: String, s2: String) : Either[NumberFormatException, Int]=
    try {Right(s1.toInt + s2.toInt)
    } catch {
      case oter: NumberFormatException => Left(oter)
    }

 println(addInts2("0", "x"))

println(addInts2("0","3"))