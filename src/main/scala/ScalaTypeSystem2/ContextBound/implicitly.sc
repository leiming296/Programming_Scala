
//  implicitly  主要是当前作用域查找制定类型

// def implicitly[T](implicit e: T) : T

implicit val x = 1
// implicit val xa = 2

val y = implicitly[Int]

implicit val x1 = 0.0

val z = implicitly[Double]

class A(val a : Int) {
   def myInt = {
     val a = 2
     a
   }
}

val testa = new A(1)
// testa.MyInt
testa.myInt
testa.a


//本地的，继承的或者通过定义所在源代码文件中的package语句所引入的定义和声明具有最高优先级
//显式的导入具有次高优先级
//通配导入具有更次一级的优先级
//由非定义所在的源文件的package语句所引入的定义优先级最低

//def foo[Int](xx:Int)(implicit xy: List[Int])
//// 等于
//def foo[Int: List](xx: Int) = xx

//  定义出IntMonoid来表示整数，以及求和运算，并且进行求和：

val numbers = List(5, 4, 8, 6, 2)
numbers.fold(0) { (z, i) =>
  z + i
}

object IntMonoid {
    def mappend(a: Int, b: Int) = a + b
     def mzero = 0
}
def sum(xs: List[Int]) = xs.foldLeft(IntMonoid.mzero){IntMonoid.mappend}
sum(List(1, 2, 3))

