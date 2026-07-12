package Ch4;

public class Mobile {
	String brand;
	double price;
	void display() {
		System.out.println("brand : "+ brand);
		System.out.println("price :"+price);
		
	}

	public static void main(String[] args) {
		Mobile m1= new Mobile();
		m1.brand="oppo";
		m1.price=28000;
		Mobile m2= new Mobile();
		m2.brand="vivo";
		m2.price=30000;
		m1.display();
		m2.display();

			
		

	}

}
