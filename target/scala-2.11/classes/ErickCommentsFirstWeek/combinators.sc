// map
val numbers = List(1,2,3,4)
numbers.map((i:Int) => 2*i)
def timesTwo(i: Int): Int = i*2
numbers.map(timesTwo _)
// foreach, filter, zip
List(1,2,3).zip(List("a", "b", "c"))
// partition 根据函数返回值对列表拆分
numbers.partition(_%2 == 0 )