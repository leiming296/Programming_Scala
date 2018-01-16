
import ObjectOrientedProgramming.ZipCode

// Zipcode(12345)

// prinln()

ZipCode(12345)

ZipCode(12345, Some(6789))
// res0: ObjectOrientedProgramming.ZipCode = 12345-6789

ZipCode(12345, 6789)

try{ZipCode(0,6789)}catch{
  case e : java.lang.IllegalArgumentException => e
}

try{ ZipCode(12345,0)}catch{
  case e : java.lang.IllegalArgumentException => e
}