package print_java;

public class Weight_Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//int w=171;	
	
	//if (w<170)
	//{System.out.println("You are not overweight");}
	//else
	//{System.out.println("}Your are overweight");}
		
		//BMI CALCULATION
	double w1=150;
	double h1=72;
	double BMI=(w1/(h1*h1))*703;
	{System.out.println("Your Body Mass Index="+BMI);}
		
		if(BMI<25.00)
		
		{System.out.println("Your weight is"+w1);
		System.out.println("You are in good health and  not Obese, Keep it up");}
		
		else
		
		{System.out.println("Your weight is" +w1);
		System.out.println("looks like Your are obese and you have to work on it");}
		
		
		
	}

}
