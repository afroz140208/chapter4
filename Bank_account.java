package Ch4;

import java.util.Scanner;

public class Bank_account {
	double balance=0;
	void deposit() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter deposit amount :");
		balance= sc.nextDouble();
	}
	void widraw() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter widraw amount :");
		balance =balance- sc.nextDouble();
		
		
	}
	void display() {
		System.out.println("final balance : "+ balance);
		
		
	}
	
	
	

	public static void main(String[] args) {
	Bank_account obj= new Bank_account();
	obj.deposit();
	obj.widraw();
	obj.display();
	
	
	

	}

}
