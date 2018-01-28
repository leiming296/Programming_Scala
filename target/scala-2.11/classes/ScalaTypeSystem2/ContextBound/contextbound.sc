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
def sumIm[A](xs: List[A])(implicit m: Monoid[A]) = xs.foldLeft(m.mzero)(m.mappend)
// sum(List(1,2,3))//error，缺少隐式参数
//我们再定义一个隐式参数：
implicit val intMonoid = IntMonoid
implicit val stringMonoid = StringMonoid
sumIm(List(1,2,3))
//还记得我们刚才说的上下文绑定么，
//sum是不是可以改写成上下文绑定的形式呢，当然可以：
def sumCom[A: Monoid](xs: List[A]) = {
  val m = implicitly[Monoid[A]] // 里从上下文中提取了哪个隐式值，也就是原来的implicit m：Monoid[A]
  xs.foldLeft(m.mzero)(m.mappend)
}
// sumCom(List("a", "b","c"))

sumCom(List(1, 2, 3))
sumCom(List("a","b"))

