package Ch4;

public class Class_student {
	String name;
	int age;
	void displayInfo() {
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		
	}
	
	
	public static void main(String[] args) {
		Class_student s =new Class_student ();
		s.name="abi";
		s.age=18;
		s.displayInfo();
		
		
		
	}

}
