package corejava;

public class callByReference {
	
	
	int data=10;
	
	public void change(callByReference ob) {
		ob.data = ob.data+10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		callByReference ob = new callByReference();
		
		ob.change(ob);
		System.out.println(ob.data);
	}

}
