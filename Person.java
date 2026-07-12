package Ch4;

public class Person {
	String name="abi";
	int age=18;
	String city="chennai";
	void display() {
		System.out.println("name :"+ name);
	    System.out.println("age :"+age);
	    System.out.println("city :"+ city);
	}

	public static void main(String[] args) {
		Person p=new Person();
		p.display();
		
		
		
		
	}

}
