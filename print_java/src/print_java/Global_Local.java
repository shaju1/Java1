package print_java;

public class Global_Local {
	
	static int c=7000;//GLOBAL VARIABLE-it can use anywhere

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		salary();
		dream_salary();
		
	}
	
	public static void salary()	
	{
		int x=5000;// LOCAL VARIABLE-It can use only in a particular function
		System.out.println(x);
		System.out.println(c);
	}
	
	
	public static void dream_salary()
	
	{
		int y=10000;
		System.out.println(y);
		System.out.println(c);
	}
	
}
