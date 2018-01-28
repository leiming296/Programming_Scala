
class Service {

    class Logger {
       def Log(message: String): Unit = println(s"log: $message")
    }

   val logger: Logger = new Logger

}

val s1 = new Service

val s2 = new Service {override val logger = s1.logger}