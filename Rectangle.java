package Ch4;
import java.util.Scanner;
public class Rectangle {
	double length;
	double width;
	void getdata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length:");
		length=sc.nextDouble();
		System.out.println("enter width:");
		width=sc.nextDouble(); 
	}
		double calculateArea() {
			return length*width;
			
		}
		double calculatePerimeter() {
			return 2*(length+width);
		}
		
			void display() {
				System.out.println("area = "+calculateArea());
				System.out.println("perimeter = "+ calculatePerimeter());
			}
		
	
	

	

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.getdata();
		r.display();
		

	}

}
