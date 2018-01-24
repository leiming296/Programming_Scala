
// class Consumer[+T](t: T) {def use(t: T) = {}}
// 编译会出错。出错信息为 "Covariant type T occurs in contravariant position in type T of value t"。

class Consumer[+T](t: T)(implicit m1:Manifest[T]) {
  def get(): T = {m1.runtimeClass.newInstance.asInstanceOf[T]}
}

class Consumer2[+T](t: T) {
   def use[U >: T](u: U) = {println(u)}
}

