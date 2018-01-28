
// sum types is enumerations

object Breed extends Enumeration {
    type Breed = Value
    val doberman= Value("Doberman Prinscher")
    val yorkie  = Value ("Yorkshire Terrier")
    val scottie = Value("Scottish Terrier")
    val dane = Value("Great Dane")
    val portie = Value ("Portugueese Water dog")
}

// implement a sum type is to use a sealed hierrchy of objects

sealed trait Breed {val name: String}

case object doberman extends Breed {val name ="Doberman Prinscher" }
case object yorkie extends Breed {val name ="Yorkshire Terrier"}
case object scottie extends Breed {val name = "Scottish Terrier"  }
case object dane extends Breed {val name ="Great Dane" }
case object portie extends Breed {val name = "Portugueese Water dog" }