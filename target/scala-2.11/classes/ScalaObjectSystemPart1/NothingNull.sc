
def m(l: List[Int]) : List[Int] = l map (i => ???)

// m(List(1, 2,3))

//  None is an object, the subtype of Option

//case object None extends Option[Nothing] {
//  def isEmpty = true
//  def get = throw new NoSuchElementException("None.get")
//}

  def get (key: A) : Option[B] = {
     if(contains(key))  Some(getValue(key))
     else None
  }