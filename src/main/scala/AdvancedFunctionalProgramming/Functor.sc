
import AdvancedFunctionalProgramming._
import scala.language.higherKinds

val fii: Int => Int = i => i *2

val fid : Int => Double= i => 2.1 *i

val fds: Double => String  = d => d.toString

SeqF.map(List(1, 2, 3, 4))(fii)
SeqF.map(List.empty[Int])(fii)

OptionF.map(Some(2))(fii)
OptionF.map(Option.empty[Int])(fii)

val fa = FunctionF.map(fid)(fds)
fa(2)

// val fb = FunctionF.map(fid)(fds)
// fb(2)
val fb = FunctionF.map[Int ,Double, String](fid)(fds)
fb(2)

val fc = fds compose fid
fc(2)