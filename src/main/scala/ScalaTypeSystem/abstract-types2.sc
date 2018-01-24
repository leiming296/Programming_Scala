 // https://docs.scala-lang.org/tour/abstract-types.html
trait Buffer {
  type  T
  val element: T
}

abstract class SeqBuffer extends Buffer {
   type U
   type T <: Seq[U]
    def length = element.length
}
//Notice how we can use yet another abstract type
//U as an upper-type-bound. This class SeqBuffer
//allows us to store only sequences in the buffer
//by stating that type T has to be
//a subtype of Seq[U] for a new abstract type U


abstract class IntSeqBuffer extends SeqBuffer {
   type U = Int
}
//Traits or classes with abstract type members
//are often used in combination
//with anonymous class instantiations.

def newIntSeqBuf(elem1: Int, elem2: Int): IntSeqBuffer =
     new IntSeqBuffer {
         type T = List[U]
          val element = List(elem1, elem2)
     }

//Here the factory newIntSeqBuf uses an anonymous
//class implementation of IntSeqBuf (i.e. new
//    IntSeqBuffer),
//setting type T to a List[Int]

val buf = newIntSeqBuf(7,8)
println("length = " + buf.length)
println("content = " + buf.element)