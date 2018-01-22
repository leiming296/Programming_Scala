
package scopeA {
   private[scopeA] class PrivateClass1

   package scopeA2 {
     private[scopeA2] class PrivateClass2
     private[scopeA] class PrivateClass3
   }

   class PrivateClass4 extends PrivateClass1

   protected class PrivateClass5 extends PrivateClass1
   private class PrivatedClass6 extends PrivateClass1
  private[this] class PrivateClass7 extends PrivateClass1

  private[this] class PrivateClass8 extends scopeA2.PrivateClass2
  private[this] class PrivateClass9 extends scopeA2.PrivateCLass3
}

package scopeB {
   class PrivateClassB extends scopeA.PrivateClass1
}