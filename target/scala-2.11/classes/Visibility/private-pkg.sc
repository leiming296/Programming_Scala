
package scopeA {
   class PrivateClass1 {
       private[scopeA] val privateField = 1

       class Nested {private[scopeA] val nestedFiled = 1}

        private[scopeA] val nested = new Nested
   }

   class PrivateClass2 extends PrivateClass1 {
        val field = privateField
        val nfield = new Nested().nestedField
   }

   class PrivateClass3 {
      val privateClass1 = new PrivateClass1
       val privateField = privateClass1.privateField
     val privateField = privateClass1.nested.nestedField
   }

   package scopeA2 {
     class PrivateClass4 {
       private[scopeA2] val field1 = 1
       private[scopeA] val field2 =2
     }
   }

  class PrivateClass{
    val privateClass4 = new scopeA2.PrivateClass4
    val field1 = privateClass4.field1
    val field2 = privateClass4.field2
  }

}

package scopeB {

  import scopeA.PrivateClass1

  class PrivateClass1B extends scopeA.privateClass1 {
     val field1 = privateField
    val privatClass1 = new scopeA.PrivateClass1
    val field2 = privateClass1.privateField
  }
}
