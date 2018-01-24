
trait Persistence {def startPersistence() : Unit }

trait Midtier {def startMidtier() : Unit}

trait UI {def startUI(): Unit}

trait Database extends Persistence {
    def startPersistence(): Unit = print( "Starting Database")
}

trait BizLogic extends Midtier {
     def startMidtier() : Unit = println("Starting BizLogic")
}

trait WebUI extends UI {
      def startUI(): Unit = println("starting WebUI")
}

trait APP {self: Persistence with Midtier with UI=>
      def run() = {
         startPersistence()
         startMidtier()
         startUI()
      }
}

object MyApp extends App with Database with BizLogic with WebUI


