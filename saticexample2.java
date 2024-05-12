package corejava;

class abc {
	static void m2() {
		System.out.println(89);
		//m3(); //Cannot make a static reference to the non-static method m3() from the type abc
	}
 void m3() {
		System.out.println(87);
	}
}

public class saticexample2 {
	public static void main(String[] args) {
		abc.m2();
	}
}
