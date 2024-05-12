////package corejava;
////
////
////
////public class FinalClass {
////	public void method1() {
////		System.out.println("Method 1 in FinalClass");
////	}
////
////	public final void method2() {
////		System.out.println("Method 2 in FinalClass");
////	}
////	// This will cause a compilation error because FinalClass cannot be subclassed
////	// class sub extends FinalClass{
////
////	// }
////
////	class SubClass extends FinalClass {
////		// This method overrides method1() from FinalClass
////		public void method1() {
////			System.out.println("Method 1 overridden in SubClass");
////		}
////
////		public static void main(String[] args) {
////			// TODO Auto-generated method stub
////			SubClass  cc = new SubClass();
////			cc.method1();
////
////		}
////
////	}
////}
//
//package corejava;
//
//class FinalClass {
//    public void method1() {
//        System.out.println("Method 1 in FinalClass");
//    }
//
//
//    public final void method2() {
//        System.out.println("Method 2 in FinalClass");
//    }
// }
//
//   class SubClass extends FinalClass {
//        // This method overrides method1() from FinalClass
//	   public void method1() {
//           System.out.println("Method 1 overridden in SubClass");
//       }
//   }
//
//public class example{
//	 public static void main(String[] args) {
//         // You can create an instance of SubClass here
//         SubClass sub = new SubClass();
//         sub.method1();
//     }
//}
//       
//    
//   
//
//

package corejava;

final class  FinalClass {
    public void method1() {
        System.out.println("Method 1 in FinalClass");
    }

    public final void method2() {
        System.out.println("Method 2 in FinalClass");
    }
}

class SubClass extends Example {
    // This method overrides method1() from FinalClass
    public void method1() {
        System.out.println("Method 1 overridden in SubClass");
    }
}

public class Example {
    public static void main(String[] args) {
        // You can create an instance of SubClass here
        SubClass sub = new SubClass();
        sub.method1();
    }
}
// okok 
//
