package print_java;

import java.util.Scanner;

public class user_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner reader = new Scanner(System.in);		
System.out.println("Your age");

try {
		int n = reader.nextInt();
		
		System.out.println("My age is "+n);
		
		System.out.println("What is your name?");
		
		String name = reader .next();
		
		System.out.println("My name is "+name);
		
		System.out.println("Your address");
		String ad =reader.next();
		System.out.println(ad);
}

catch (Exception e){
	
	System.out.println("Don't put any string value");
}

finally {
	System.out.println("Thank you for your input");
}
	}

}
