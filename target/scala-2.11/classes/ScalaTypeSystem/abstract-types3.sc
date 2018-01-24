
abstract class Buffer[+T] {
  val element : T
}

abstract class SeqBuffer[U, +T <: Seq[U]] extends Buffer[T] {
  def length = element.length
}

//def newIntSeqBuf(el: Int, e2: Int): SeqBuffer[Int, Seq[Int]] =
//     new SeqBuffer[Int, List[Int]] {
//       val element = List(e1, e2)
//     }

def newIntSeqBuf(e1: Int, e2: Int): SeqBuffer[Int, Seq[Int]] =
  new SeqBuffer[Int, List[Int]] {
    val element = List(e1, e2)
  }

val buf = newIntSeqBuf(7,8)

println("length = " + buf.length)
println("content = " + buf.element)