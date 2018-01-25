package ScalaTypeSystem2


trait Logger {                                                       // <1>
  def log(message: String): Unit
}
// A Logger trait

class ConsoleLogger extends Logger {                                 // <2>
  def log(message: String): Unit = println(s"log: $message")
}
// a concrete loger that logs to the console, for simplicity

trait Service {                                                      // <3>
type Log <: Logger
  val logger: Log
}
// a service trait that defines an abstract type alias for the logger
// and declares a field for it

class Service1 extends Service {                                     // <4>
type Log = ConsoleLogger
  val logger: ConsoleLogger = new ConsoleLogger
}
// a concrete service that uses consolelogger

