

class USPphoneNumber (val s: String) extends AnyVal {

  override def toString = {
    val digs = digits(s)
    val areacode = digs.substring(0, 3)
    val exchange = digs.substring(3,6)
    val subnumber = digs.substring(6,10)
    s"($areacode) $exchange-$subnumber"
  }

  private def digits(str: String): String = str.replaceAll("""\D""","")
}

val number = new USPphoneNumber("987-654-3210")