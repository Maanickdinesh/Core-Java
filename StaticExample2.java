package corejava;


class student{
	int id;
	String name;
	static String  collage ="UCEV";
	
	student(int id,String name){
		this.id = id;
		this.name = name;
	}
	void display() {
		System.out.println(id + " "+ name + " "+ collage);
	}
	
}
public class StaticExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
student ss = new student(4, "Dinesh");
student s1 = new student(5, "Dineshkumar");
student.collage="UCEA";
ss.display();
s1.display();
	}

}
