package Ch4;

public class Animal {
	String name;
	String sound;
	void sound() {
		System.out.println(name + "sounds "+sound);
		
		
	}

	public static void main(String[] args) {
	Animal a1=new Animal();
	a1.name="dog";
	a1.sound="bow bow";
	Animal a2=new Animal();
	a2.name="cat";
	a2.sound="meow";
	a1.sound();
	a2.sound();
	

	}

}
