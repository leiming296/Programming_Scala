// 还可能进行String的运算，所以我们抽象了Monoid：

trait Monoid[A] {
    def mappend(a: A, b: A): A

    def mzero: A
}

object IntMonoid extends Monoid[Int] {
     override def mappend(a: Int, b: Int) : Int = a + b
      override def mzero : Int = 0
}


object StringMonoid extends Monoid[String] {
     override def mappend(a: String, b: String): String = a + b
     override def mzero: String = ""
}

def sumInt(xs: List[Int]) = xs.foldLeft(IntMonoid.mzero)(IntMonoid.mappend)
def sumString(xs: List[String]) = xs.foldLeft(StringMonoid.mzero)(StringMonoid.mappend)

sumInt(List(1, 2, 3))
sumString(List("a", "b", "c"))

// 再次抽象
def sum[A](xs: List[A], m: Monoid[A]) = xs. foldLeft(m.mzero)(m.mappend)
sum(List(1,2,3), IntMonoid)
sum(List("a", "b", "c"), StringMonoid)

// 每次都写一个Monoid显得过于累赘：
def sum[A](xs: List[A])(implicit m: Monoid[A]) = xs.foldLeft(m.mzero)(m.mappend)
// sum(List(1,2,3)) 
implicit val intMonoid = IntMonoid
sum(List(1,2,3))
