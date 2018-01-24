
class Upper

class Middle1 extends Upper

class Middle2 extends Middle1

class Lower extends Middle2

case class Com[A >: Lower <: Upper](a: A)

// case class C2[A <: Upper >: Lower](a: A)