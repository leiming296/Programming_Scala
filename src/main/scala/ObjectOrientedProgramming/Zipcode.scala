package ObjectOrientedProgramming

//  What if we want to validate the input argument to ensure that the resulting instances have a valid state
//  use the the require method to validate input

case class ZipCode(zip: Int, extension: Option[Int] = None) {
  require(valid(zip, extension),                                     // <1>
    s"Invalid Zip+4 specified: $toString")

  protected def valid(z: Int, e: Option[Int]): Boolean = {
    if (0 < z && z <= 99999) e match {
      case None    => validUSPS(z, 0)
      case Some(e) => 0 < e && e <= 9999 && validUSPS(z, e)
    }
    else false
  }

  /** Is it a real US Postal Service zip code? */
  protected def validUSPS(i: Int, e: Int): Boolean = true            // <2>

  override def toString =                                            // <3>
    if (extension != None) s"$zip-${extension.get}" else zip.toString
}

object ZipCode {
  def apply (zip: Int, extension: Int): ZipCode =
    new ZipCode(zip, Some(extension))
}