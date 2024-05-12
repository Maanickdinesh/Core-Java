package corejava;

class Arm {
	static void show() {
		System.out.println("I am parent show");
	}
}

class Big extends Arm {
	static void show() {
		System.out.println("I am show in child");
	}
}

public class saticexample3 {
	public static void main(String[] args) {
		Arm b1 = new Big(); // in case of overriding of non static methods if we create reference of parent
							// class and object of child class
		b1.show();
	}
}
