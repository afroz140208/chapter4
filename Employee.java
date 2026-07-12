package Ch4;
import java.util.Scanner;

public class Employee {
	long id;
	String name;
	long ph;
	String dept;
	void displayInfo() {
		System.out.println("id  :"+ id);
		System.out.println("name :"+ name);
		System.out.println("ph:"+ ph);
		System.out.println("dept :"+ dept);
		
		
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee e=new Employee ();
		System.out.println("enter id:");
		e.id = sc.nextLong();
		System.out.println("enter name");
		e.name = sc.next();
		System.out.println("enter ph");
		e.ph=sc.nextLong();
		System.out.println("enter dept");
		e.dept=sc.next();
		System.out.println("\n Employee Details");
		e.displayInfo();
		sc.close();
		
		
		
		
		
		
		 

	}

}
