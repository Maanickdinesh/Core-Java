package corejava;

class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Overrides the makeSound method from Animal class
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

public class exampleintheritance {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound(); // Output: Animal makes a sound
        
        Dog dog = new Dog();
        dog.makeSound(); // Output: Dog barks
    }
} // okok
