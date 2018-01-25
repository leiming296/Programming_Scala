
// https://www.w3cschool.cn/scala/scala-constructors.html

//当在构造函数参数上未指定val和var时，Scala不生成getter或setter。
//正如你在这里可以看到的，你不能访问书的字段标题。
class Book1(title: String)
val book1 = new Book1("scala programming ")
 //  println(book1.title)



// consructor argument var
// 如果构造函数参数声明为var，Scala将生成访问器和mutator方法

//object MainBook2 {
//   def main(args: Array[String]): Unit = {
     class Book2 (var title: String)
     val book2 = new Book2("beginning scala")
     book2.title = "new title Raymond"
     println(book2.title)



// 因为构造函数字段被定义为一个val，所以该字段的值是不可变的。
// 因此，Scala只生成getter方法，没有setter方法。
class Book3( val title:String)
val book3a = new Book3("Scala studying ")
println(book3a.title )
// book3.title = "new title"  //Error
val book3b = new Book3("Scala research")
println(book3b.title)