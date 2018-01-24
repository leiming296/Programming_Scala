
import ScalaTypeSystem.selftype._

val buttons = Vector(new ButtonSubjectObserver.ObservableButton("one"), new ButtonSubjectObserver.ObservableButton("two"))
val observer = new ButtonClickObserver

buttons foreach (_.addObserver(observer))
for (i <- 0 to 2)  buttons(0).click()
for(i <- 0 to 4)   buttons(1).click()
println(observer.clicks)