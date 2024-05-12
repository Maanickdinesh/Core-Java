package corejava;

public class MyClass {
    private int value;

    // Private constructor to restrict instantiation from outside
    private MyClass(int value) {
        this.value = value;
    }

    // Static factory method to create instances of MyClass
    public static MyClass createInstance() {
        // You can provide custom logic here to create instances
        return new MyClass(0); // Creating an instance with a default value of 0
    }

    // Getter method for value field
    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        // Creating an instance of MyClass using the static factory method
        MyClass obj = MyClass.createInstance();

        // Accessing the value field using the getter method
        System.out.println("Value: " + obj.getValue());
    }
}
