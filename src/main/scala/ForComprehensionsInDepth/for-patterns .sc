
val inoreRegex = """^\s*(#.*|\s*)""".r
val kvRegex = """^\s*([^=]+)\s*=\s*([^#]+)\s*.*$""".r

val properties =
  """
    |# Book properties
    |
    |book.name = programming scala, second edition # A comment
    |book.authors = dean wampler and alex payne
    |book.publisher = O reilly
    |
  """.stripMargin

val kvPirs = for {
  prop <- properties.split("\n")
  kvRegex(key,value) = prop
  if inoreRegex.findFirstIn(prop)
} yield(key.trim, value.trim)