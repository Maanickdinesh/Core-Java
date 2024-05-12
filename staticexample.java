package corejava;



public class staticexample {
	
	public final int a =10;
	
	public void mx() {
//static int b=10; showing compile time error because  we cannot declear satic in local variable.
		int b =10;
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticexample fe = new staticexample();
		fe.mx();
	}

}

