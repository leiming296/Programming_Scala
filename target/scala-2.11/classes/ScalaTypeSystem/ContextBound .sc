
//法如下：context bound在Scala 2.8.0中引入，也被称作type class pattern。
//view bound使用A <% String方式，context bound则需要参数化的类型，如Ordered[A]。
//它声明了一个类型A,隐式地有一个类型B[A],语

def f[A : B](a: A)  = g(a)