package print_java;

import java.util.Scanner;

public class Grocery_Software {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		try {
		String Grocery[] = new String[5];
		
		{System.out.println("Available items ");}	
		Grocery[0]= "Milk";
		Grocery[1]= "Bread";
		Grocery[2]= "Butter";
		Grocery[3]= "Jam";
		Grocery[4]= "Banana";
		
		for (int x=0;x<Grocery.length;x++)
		
		{
					
			System.out.println((Grocery [x]));
		}
		
		double Milk=2;
		double Bread=2.05;
		double Butter= 1.07;
		double Jam=3;
		double Banana=0.79;
		Scanner reader = new Scanner(System.in);
		int m=2;
		System.out.println("Type the item name under and press enter to see price");
		String x= reader.next();
		if(x.equals("Milk"))
		{System.out.println("Price of " +x);
		//System.out.println("Yes,I want to knnow price of "+x);
		System.out.println("Price of the item is $" +m      +"and tax$" + m*0.007);
		System.out.println("So,The total would be " + (m+m*0.006));}
		
		else if(x.equals("Bread"))
		{System.out.println("Price of " +x);
		//System.out.println("Yes,I want to knnow price of "+x);
		System.out.println("Price of the item is  $" +Bread      +"and tax$" + m*0.007);
		System.out.println("So,The total would be " + (Bread+Bread*0.006));}
		
		else if(x.equals("Butter"))
		{System.out.println("Price of " +x);
		//System.out.println("Yes,I want to knnow price of "+x);
		System.out.println("Price of the item is  $" +Butter      +"and tax$" + m*0.007);
		System.out.println("So,The total would be " + (Butter+Butter*0.006));}
		
		else if(x.equals("Jam"))
		{System.out.println("Price of " +x);
		//System.out.println("Yes,I want to knnow price of "+x);
		System.out.println("Price of the item is  $" +Jam      +"and tax$" + m*0.007);
		System.out.println("So,The total would be " + (Jam+Jam*0.006));}
		
		else if(x.equals("Banana"))
		{System.out.println("Price of " +x);
		//System.out.println("Yes,I want to knnow price of "+x);
		System.out.println("Price of the item is  $" +Banana      +"and tax$" + m*0.007);
		System.out.println("So,The total would be " + (Banana+Banana*0.006));}
		
		else
		{System.out.println("Sorry!!!! We don't have that item");}
		
		
		}
		
	  catch (Exception e) {
		System.out.println("Please don't ask any that we don't have!!!");
		}
		
		finally {
			System.out.println("Thank You For Shopping");
		
		}
		
		}

}
