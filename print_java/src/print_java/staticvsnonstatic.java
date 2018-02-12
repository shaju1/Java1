package print_java;

public class staticvsnonstatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		staticvsnonstatic x=new staticvsnonstatic();
		car();
		x.food();
		
	}
	
	
	public static void car()
	
	{
		System.out.println("Honda");
	}
	
	
	public void food()
	{
		System.out.println("Milk");
	}
}
