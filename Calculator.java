package Ch4;

public class Calculator {
	void addtion() {
		int a=10,b=20;
		System.out.println("addtion :"+ (a+b));
		
		
	}
	void subraction() {
		int a =50 ;int b=29;
		System.out.println("subraction :"+ (a-b));
		
	}
	void multiplication() {
		int a=39;int b= 20;
		System.out.println("multiplication :"+ (a*b));
		
		
		
	}
	void division() {
		int a =28;int b=37;
		System.out.println("division :"+ (a/b));
	}

	public static void main(String[] args) {
		Calculator c =new Calculator();
		c.addtion();
		c.subraction();
		c.multiplication();
		c.division();
		
		

	}

}
