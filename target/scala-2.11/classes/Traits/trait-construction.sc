
trait T1 {
  println(s" in T1: x= $x")
  val  x =1
  println(s" in T1: x=$x")
}

trait T2 {
  println(s" in T2: y= $y")
  val y ="T2"
  println(s" in T2: y=$y")
}

class Base12 {
  println(s" in Base12: b=$b")
  val b = "base12"
  println(s" in Base12: b=$b")
}

class C12 extends Base12 with T1 with T2 {
  println(s" in C12: c =$c")
  val c ="c12"
  println(s" in C12: c= $c")
}

println(s"creating c12:")
new C12
println(s"After creating C12")

//creating c12:
//  res0: Unit = ()
//in Base12: b=null
//in Base12: b=base12
//in T1: x= 0
//in T1: x=1
//in T2: y= null
//in T2: y=T2
//in C12: c =null
//in C12: c= c12
//res1: C12 = Traits.A$A88$A$A88$C12@21712a2e
//  After creating C12
//res2: Unit = ()

/**
  *  from the output, we have a base class Base12 for C12,
  *  It is evaluated first, then the traits T1 and T2, and finally
  *   the body of C12
  * */