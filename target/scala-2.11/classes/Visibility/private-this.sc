
package scopeA {
      class PrivateClass1(private[this] val privateField1: Int){

      private[this] val privateField2 = 1

      def equalFields(other: PrivateClass1) =
        (privateField1 == other.privateField1) &&
          (privateField2 == other.privateField2) &&
          (nested == other.nested)

        class Nested {private[this] val nestedField = 1}

        private[this] val nested = new Nested
}

   class PrivateClass2 extends PrivateClass1(1) {
     val field1 = privateField1
     val field2 = privateField2
     val nfield = new Nested().nestedField
   }

   class PrivateClass3 {
     val privateClass1 = new PrivateClass1(1)
     val privateField1 = privateClass1.privateField1
     val privateField2 = privateClass1.privateField2
     val privateNField = privateClass1.nested.nestedField

   }

}