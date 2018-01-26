
import AdvancedFunctionalProgramming.Functor._
import scala.language.higherKinds

val fil: Int => Int = i => i *2

val fid : Int => Double= i => 2.1 *i

val fds: Double => String  = d => d.toString

SeqF.map(List(1, 2, 3, 4))(fil)