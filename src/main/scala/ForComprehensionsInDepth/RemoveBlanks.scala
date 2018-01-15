package ForComprehensionsInDepth

object RemoveBlanks {
  /**
    * Remove blank lines from the specified input file
    * */
   def apply(path: String, compreWhiteSpace: Boolean = false ) : Seq[String]=
      for {
        line <- scala.io.Source.fromFile(path).getLines.toSeq
        if line.matches("""^\s*$""")== false
        line2 = if(compreWhiteSpace) line replaceAll("\\s+"," ") else line
      } yield line2

  /**
    * Remove blank lines from the specified input files and echo the remaining lines to standard output
    * one after the other. @param args list of file path.  preffix each with an optional "-" to
    * compress remaining whitespace in the file
    * */

  def main(args: Array[String]) = for {
     path2 <-args
    (compress, path) = if(path2 startsWith  "-")(true, path2.substring(1)) else (false, path2)
    line <- apply(path,compress)
  } println(line)

}
