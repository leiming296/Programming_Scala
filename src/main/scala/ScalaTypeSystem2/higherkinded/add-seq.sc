
import ScalaTypeSystem2.higherkinded.Add._
import ScalaTypeSystem2.higherkinded.Add
//  import the add trait, followed by the implicits defined in the
// Add companion

def sumSeq[T: Add](seq: Seq[T]): T =
   seq reduce(implicitly[Add[T]].add(_,_))
//  use a context bound and implicitly

sumSeq(Vector(1->10, 2-> 20, 3->30))
// 6, 60
sumSeq( 1 to 10 )
// 55
// sumSeq(Option(2))
// it is error to pass an option, because option is not a subtype of seq
