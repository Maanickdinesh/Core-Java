package corejava;

public class callbyvalue {
	
	static void add(int a) {
		a++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =10;
		add(a);
		System.out.println(a);
	}

}
