
//class UseTrait{}
//
//trait Logger { def log(mag:String) }
//
//class ConcreteLogger extends Logger with Cloneable {
//  override def log(msg: String) = println("Log:  " + msg)
//
//  def concreteLog {
//    log("it is me, raymond")
//  }
//}
//
//trait TraitLogger extends Logger {
//    override def log(msg: String)= {println ("TraitLogger Log content is  " + msg) }
//  }
//
//object UseTrait extends App {
//   var logger = new ConcreteLogger with TraitLogger
//    logger.concreteLog
//}
//
//UseTrait.logger.concreteLog


class UseTrait {}
trait Logger{def log(msg : String){}}

class ConcreteLogger extends Logger with Cloneable{
  override def log(msg : String) = println("Log : " + msg)
  def concreteLog{   log("It is me !!!")  }
}

val logmes = new ConcreteLogger
logmes.concreteLog

trait TraitLogger extends Logger{
  override def log (msg : String){  println(" TraitLogger log content is : " + msg)  }
}


object UseTrait extends App{
  var logger = new ConcreteLogger with TraitLogger
  logger.concreteLog
}

var logger = new ConcreteLogger with TraitLogger
logger.concreteLog