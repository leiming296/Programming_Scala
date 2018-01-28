
import scala.language.higherKinds
import ScalaTypeSystem2.higherkinded.{Add, Reduce}
import ScalaTypeSystem2.higherkinded.Add._
import ScalaTypeSystem2.higherkinded.Reduce._

def sum[T: Add, M[T]](container:M[T]) (
     implicit red: Reduce[T, M]): T =
  red.reduce(container) (implicitly[Add[T]].add(_,_))


sum(Vector(1->10, 2->20, 3->30))

sum(1 to 10)

sum(Option(2))

//sum(Int, Option(None ))