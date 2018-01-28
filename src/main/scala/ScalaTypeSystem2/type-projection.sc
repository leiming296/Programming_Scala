

import ScalaTypeSystem2._

 val l1: Service.Log = new ConsoleLogger

 val l2: Service1.Log = new ConsoleLogger

 val l3: Service#Log = new ConsoleLogger

 val l4: Service1#Log = new ConsoleLogger


val s11 = new Service1
val s12 = new Service1

val l1: Logger = s11.logger
val l2: Logger = s12.logger

val l11: s11.logger.type = s11.logger
// val l12: s11.logger.type = s12.logger
