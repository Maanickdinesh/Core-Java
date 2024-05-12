package corejava;



final class mutabale{    // make class as final
	private final int id;   // make variable as final and priavte
	private String name;
	
	
	public mutabale(int id, String name) {  // invoke constructor
		super();
		this.id = id;
		this.name = name;
	}
public String getName() {   // generate get method only
		return name; 
	}

public int getId() {
		return id;
	}
	
	
}
public class ImmutableClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mutabale ms = new mutabale(9, "dinesh");
		System.out.println(ms.getId());
		System.out.println(ms.getName());
		

	}

}
