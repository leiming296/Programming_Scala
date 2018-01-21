
// functional combinators

val numbers = List(1,2,3,4)
numbers map((i: Int) => i*2)

def timesTwo(i: Int) :Int = i*2
numbers map(timesTwo _)

// foreach  like map but no return value  only for side effect functions

numbers foreach((i: Int) => i*2)
// save return values
val doubled = numbers foreach ((i: Int) => i*2)

//  filter
numbers.filter((i: Int) => i%2 == 0)

def isEven(i: Int) : Boolean = i%2 == 0
numbers.filter(isEven _)

// zip combine two lists  to become a double list

List (1, 2, 3).zip(List("a", "b", "c"))

// partition divide a collection

val numbers2 = List(1, 2 ,3, 4, 5, 6, 7, 8, 9, 10)

numbers2.partition(_ % 2 == 0)

// find  rerturn the first element which match the val

numbers2.find((i: Int) => i>5)


//  drop or  drowWhile  删除前 i 元素
numbers2.drop(5)
numbers2.dropWhile(_ %2 != 0)

// foldLest
numbers2.foldLeft(0)((m: Int, n: Int) => m + n )
// numbers2.foldLeft{(m: Int, n: Int) => println("m: " +m + "n:"+n ); m+n }
numbers2.foldLeft(0) { (m: Int, n: Int) => println("m: " + m + " n: " + n); m + n }

//  flatten  将嵌套结化为一个 集合
List(List(1,2), List(3,4)).flatten

//  flatMap flatMap是一种常用的组合子，结合映射[mapping]和扁平化[flattening]。 flatMap需要一个处理嵌套列表的函数，然后将结果串连起来。
val nestedNumbers = List( List(1 ,2), List(3, 4))
nestedNumbers.flatMap(x=>x.map(_ *2))

//  wrrite your own functions
//def outMap(numbers: List[Int], fn: Int=>Int ): List[Int] = {
//    numbers.foldRight(List[Int]()) {x: Int, xs: List[Int]) => fn(x) :: xs  }
//}
def ourMap(numbers: List[Int], fn: Int => Int): List[Int] = {
  numbers.foldRight(List[Int]()) { (x: Int, xs: List[Int]) =>
    fn(x) :: xs
  }
}

ourMap(numbers2, timesTwo(_))

val extensions = Map("steven" ->100, "bob" ->101, "joe" ->201)
//extensions.filter( namePhnone: (String, Int)=>namePhone.2<200)
extensions.filter((namePhone: (String, Int)) => namePhone._2 < 200)

extensions.filter({case (name, extension) => extension < 200})