
case class User(
                 id: Int,
                 firstName: String,
                 lastName: String,
                 age: Int,
                 gender: Option[String]
               )


val user = User(2, "Johanna", "Doe", 30, None)

val gender = user.gender match {
  case Some(gender) => gender
  case None => "not specified"
}

println("Gender: " + gender)

val user2 = User(2, "Johanna", "Doe", 30, None)
println("Gender: " + user2.gender.getOrElse("not specified")) // will print "not specified