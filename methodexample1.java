package corejava;

class a1 {
	  void m1() {
		System.out.println(77);
	}
}
class b1 extends a1{
	public void m1() {
	System.out.println(79);  
}
}

public class methodexample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       b1 obj = new b1();
       obj.m1();
       
	}

}
