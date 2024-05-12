package corejava;

public class staticexample1 {
    // Class-level (static) variable
    public static int classVar = 10;

    // Class-level (static) method
    public static void classMethod() {
        System.out.println("Inside classMethod()");
    }

    public void method() {
        // Method-level (local) variable
        //static int methodVar = 20; // Error: Illegal modifier for parameter methodVar; only final is permitted
        System.out.println("Inside method()");
    }

    public static void main(String[] args) {
        // Accessing class-level variable
        System.out.println("Class variable: " + classVar);

        // Calling class-level method
        classMethod();

        // Creating an instance to access method-level variable
        staticexample1 obj = new staticexample1();
        obj.method();
    }
}
