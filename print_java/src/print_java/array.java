package print_java;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Rainbow[]= new String[7];		
		
		Rainbow[0]="violet";
		Rainbow[1]="Indigo";
		Rainbow[2]="blue";
		Rainbow[3]="Green";
		Rainbow[4]="yellow";
		Rainbow[5]="Orange";
		Rainbow[6]="Red";
	
		{
			System.out.println(Rainbow[0]);
		}
		
		for (int x=0; x<Rainbow.length;x++)
		
		{
			System.out.println(Rainbow[x]);
		}
	}	

}
