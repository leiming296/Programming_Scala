
// value classes
/**
  * 它仅有一个被用作运行时底层表示的公有val参数。在编译期，其类型为Wrapper，但在运行时，
  * 它被表示为一个Int。Value class可以带有def定义，但不能再定义额外的val、var，以及内嵌
  * 的trait、class或object：
  *
  */
class Wrapper(val underlying: Int) extends AnyVal {
      def foo: Wrapper = new Wrapper(underlying*19)
}

/**
  *Value class只能继承universal traits，但其自身不能再被继承。所谓universal trait
  * 就是继承自Any的、只有def成员，且不作任何初始化工作的trait。继承自某个universal trait的
  * value class同时继承了该trait的方法，但是（调用这些方法）会带来一定的对象分配开销。例如：
  * */

trait Printable extends Any{
    def print(): Unit= println(this)
}

class Wrapper1(val underlying: Int) extends AnyVal with Printable
val w = new Wrapper1(3)
w.print()