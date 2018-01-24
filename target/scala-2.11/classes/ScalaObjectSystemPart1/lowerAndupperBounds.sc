// class Consumer[+T](t:T) { def use(t: T) = {}}
//如果协变类包含带类型参数的方法时：编译会出错。出错信息为 "Covariant type T occurs in
// contravariant position in type T of value t"。

class Consumer2[+T](t: T)(implicit m1: Manifest[T]) {
     def get(): T = {m1.runtimeClass.newInstance.asInstanceOf[T]}
}
// 但是如果返回结果为类型参数则没有问题。

// 为了在方法的参数中使用类型参数，你需要定义下界：
class Consumer[+T](t:T) {
  def use[U>:T](u: U) = {println(u)}
}

// Upper bounds 逆变

class Consumer3[-T](t: T) {
  def get[U<:T]()(implicit m1: Manifest[U]): U =
{m1.runtimeClass.newInstance.asInstanceOf[U]}}

/**
  * 可以看到方法的返回值是协变类型，方法的参数是逆变类型。
//因此协变类的类型参数可以用在方法的返回值的类型，在方法的参数类型上必须使用下界绑定 >:。
//逆变类的类型参数可以用在方法的参数类型上，用做方法的返回值类型时必须使用上界绑定 <:。
  * */