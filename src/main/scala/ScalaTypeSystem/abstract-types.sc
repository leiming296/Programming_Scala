
import java.io._
abstract class BulkReader {
  type InX
  val source: InX
  def read: String  // Read source and return a String
}

class StringBulkReader(val source: String) extends BulkReader {
  type InX = String
  def read: String = source
}

class FileBulkReader(val source: File) extends BulkReader {
  type InX = File
  def read: String = {
    val in = new BufferedInputStream(new FileInputStream(source))
    val numBytes = in.available()
    val bytes = new Array[Byte](numBytes)
    in.read(bytes, 0, numBytes)
    new String(bytes)
  }
}

println(new StringBulkReader("Hello Scala!").read)
// Assumes the current directory is src/main/scala:
println(new FileBulkReader(
  new File("C:\\Users\\ming\\workspace\\Programming_Scala\\src\\main\\scala\\ScalaTypeSystem\\abstract-types.sc")).read)