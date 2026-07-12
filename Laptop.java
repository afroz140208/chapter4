package Ch4;

public class Laptop {
	String brand;
	int ram;
	double price;
	

	public static void main(String[] args) {
		Laptop l = new Laptop();
		l.brand="lenovo";
		l.ram=18;
		l.price=50000;
		System.out.println("brand :"+ l.brand);
		System.out.println("ram : "+ l.ram);
		System.out.println("price : "+ l.price);
			
	}

}
