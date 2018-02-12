package print_java;

public class Argument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		sum(4,5);
		addition(4,5,6);
		substraction(5,10);
		name("shaju");
		salary("shaju", 5000);
	}
		
		public static void sum(int x,int y)
		
		{
			System.out.println("Sum is "+(x+y));
		}
		
		public static void addition(int a,int b,int c)
		
		{
		int x= (a+b+c);		
		
			System.out.println("Total Sum is "+x);
		}
		
		
		public static void substraction (int a, int b)
		
		{
			int s=(a-b);
			System.out.println(s);
		}
		
		
		public static void name (String x)
		
		{
			System.out.println(x);
		}
		
		
		
		public static void salary (String x, int y)
		
		{
			System.out.println("My name is " +x+ "and my salary is" +y);
		}
		
		
		
	}






