
//后我们组织下代码，我们可以将这种代数作为隐式值结构定
//义在伴生对象中，还记得我们说过的，当当前隐式实体的发生地点没找到，
//就会调用第二个规则，也就是在隐式参数的类型的隐式作用域所
//包含的全部隐式实体中查找，那么此时该类型的隐式作用域是指与该类型相关
//的全部伴生模块，所以可以去伴生对象中找：

trait Monoid[A] {
   def mappend(a: A, b: A): A
    def mzero: A
}

object Monoid {
   implicit val intMonoid: Monoid[Int] = new Monoid[Int] {
     override def mappend(a: Int, b: Int): Int = a + b
     override def mzero: Int = 0
   }

   implicit val stringMonoid: Monoid[String] = new Monoid[String] {
     override def mappend(a: String, b: String): String = a + b
     override def mzero: String = ""
   }
}

 def sum[A: Monoid](xs: List[A]) = {
    val m = implicitly[Monoid[A]]
   xs.foldLeft(m.mzero)(m.mappend)
 }

sum(List(1,2,3))
sum(List("a" ,"b"))