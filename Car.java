package Ch4;

public class Car {
	String brand;
	int model;
	int price;
	void displayInfo() {
		System.out.println("brand:"+brand);
		System.out.println("model:"+model);
		System.out.println("price:"+price);
		
	}
	
	

	public static void main(String[] args) {
		Car car1=new Car();
		car1.brand="tata";
		car1.model=120;
		car1.price=60000;
		car1.displayInfo();
		
		Car car2=new Car();
		car2.brand="nisan";
		car2.model=300;
		car2.price=100000;
		car2.displayInfo();
		
		
		
		
		

	}

}
