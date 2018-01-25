package ScalaTypeSystem2.higherkinded

//def sum(Seq: Seq[Int]): Int = Seq reduce (_+_)
//sum(Vector(1,2,3,4,5))  // Reduce: 15

trait Add[T] {
    def add(t1:T, t2: T): T
}

object Add {

    implicit val addInt = new Add[Int] {
      def add(i1: Int, i2: Int) : Int = i1 + i2
    }

     implicit val addIntIntPair = new Add[(Int, Int)]{
       def add(p1:(Int, Int), p2:(Int, Int)):(Int, Int) =
         (p1._1 + p2._1, p1._2 + p2._2)
     }
}

//object Add {
//
//}
