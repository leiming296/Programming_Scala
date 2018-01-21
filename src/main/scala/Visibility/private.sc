
package scopeA {

    class PrivateClass1(private val privateField1: Int) {
         private val privateField2 = 1

         def equalField(other: PrivateClass1) =
             (privateField1== other.privateField1) &&
             (privateField2 == other.privateField2)  &&
             (nested == other.nested)

         class Nested {
           private val nestedField = 1
         }

        private val nested = new Nested
    }

   class PrivateClass2 extends PrivateClass1(1) {
        val field1 = privateField1 // Error
        val field2 = privateField2 // Error
        val  nField = new Nested().nestedField // Error
   }

   class PrivateClass3 {
         val privateClass1 = new PrivateClass1(1)
         val privateField1 = new privateClass1.privateField1
         val privateField2 = new privateClass1.privateField2
         val privateField =  privateClass1.nested.nestedField // Error
   }

   private class PrivateClass4

   class PrivateClass5 extends PrivateClass4 // Error
   protected class PrivateClass6 extends PrivateClass4
   private class PrivateClass7 extends PrivateClass4

}

package scopeB {
   class PrivatedClass4B extends scopeA.PrivateClass4
}

