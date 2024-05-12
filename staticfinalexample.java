package corejava;

public class staticfinalexample {
	public  final   int a =90;
	public static int b =10;
	public final static int c=100;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		//
		b=20;
		staticfinalexample cc = new staticfinalexample();
	System.out.println(cc.a);
	System.out.println(c);
	System.out.println(b);
		
	}

}
