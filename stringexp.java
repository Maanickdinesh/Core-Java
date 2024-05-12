package corejava;

public class stringexp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name ="arul";
		String name1 ="arul";
String s1 = new String("Dinesh");
String s2 = new String ("Dinesh");
System.out.println(s1.hashCode());
System.out.println(s2.hashCode());
System.out.println(name.hashCode());
System.out.println(name1.hashCode());

System.out.println(s1==s2);
System.out.println(name==name1);
	}

}
