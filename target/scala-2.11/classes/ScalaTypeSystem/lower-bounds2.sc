//case class Opt[+A](value: A =null) {
//  def getOrElse(default: A) =
 //   if(value != null)value else default
//}

case class Opt[+A](value: A = null) {
  //  def getOrElse(default: A) =
    def getOrElse[U >: A](value: U) =
    if(value != null) value
    else None
}

val SeqE =  1 +: Seq(2, 3 )

// 0.1 +: SeqE

val L2 : List[AnyVal] = 0.1 +: Seq(2, 3)
