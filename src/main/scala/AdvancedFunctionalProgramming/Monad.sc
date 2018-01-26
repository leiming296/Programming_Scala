
import AdvancedFunctionalProgramming._
import scala.language.higherKinds

val seqf: Int =>Seq[Int] = i => 1 to i
val optf: Int =>Option[Int] = i => Option(i+1)

SeqM.flatMap(List(1,2,3,4))(seqf)
SeqM.flatMap(List.empty[Int])(seqf)

OptionM.flatMap(Some(2))(optf)
OptionM.flatMap(Option.empty[Int])(optf)