package Ch4;

public class Teacher {
	String name;
	int age;
	double salary;
	void details() {
		name="anu";
		age=30;
		salary=40000;
		
	}
	void display() {
		System.out.println("name :"+ name);
		System.out.println("age :"+ age);
		System.out.println("salary :"+ salary);
		
	}

	public static void main(String[] args) {
		Teacher t= new Teacher();
		t.details();
		t.display();
		
		
	}

}
