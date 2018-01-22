// import scopeA.PrivateClass1

package scopeA {
   class PrivateClass1 {
       class Nested {
         private[privateClass1] val nestedField = 1
       }

      private[PrivateClass1] val nested = new Nested
     val nestedNested = nested.nestedField
   }

  class PrivateClass2 extends PrivateClass1{
    val nfield = new Nested().nestedField
}

  class privateClass3 {
    val privateClass1 = new PrivateClass1
    val privteField = privateClass1.nested.nestedField // ERROR
  }
}