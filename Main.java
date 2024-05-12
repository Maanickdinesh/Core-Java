package corejava;

class a {
    final  static void m1() {
        System.out.println("Method m1() called");
    }

    
}
class b extends a{
	//public void m1() { cannot overrite
		
	}


public class Main {
    public static void main(String[] args) {
        // Creating an instance of inner class b
        a objB = new a();
        // Calling the main method of inner class b
      a.m1(); // Pass any required arguments here
    }
}
