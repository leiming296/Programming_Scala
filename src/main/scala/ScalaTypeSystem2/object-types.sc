
// singleton objects define both an instance and a corresponding type
case object Foo {
     override def toString = "Foo says Hello!"
}

//  define a method that takes arguments of this type, use Foo.type
def printFoo(foo: Foo.type) = println(foo)

printFoo(Foo)

