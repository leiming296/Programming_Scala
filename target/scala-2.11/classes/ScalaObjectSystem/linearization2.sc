
class C1 {print ("C1 ")}

trait T1 extends C1 {println("T1 ")}

trait T2 extends C1 {println("T2 ")}

trait T3 extends C1 {println("T3 ")}

class C2 extends T1 with T2 with T3 { println ("C2 ")}

val c2 = new C2
