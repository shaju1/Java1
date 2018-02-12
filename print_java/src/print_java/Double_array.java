package print_java;

public class Double_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Destinations[][]= new String [4][4];
		//first row
		Destinations[0][0]="Dallas";
		Destinations[0][1]="garland";
		Destinations[0][2]="richardson";
		Destinations[0][3]="mesquite";
		
		//second row
		Destinations[1][0]="neyork";
		Destinations[1][1]="california";
		Destinations[1][2]="south carolina";
		Destinations[1][3]="north carolina";
		
		//3rd row
		Destinations[2][0]="florida";
		Destinations[2][1]="miami";
		Destinations[2][2]="plano";
		Destinations[2][3]="irving";
		
		// 4 row
		Destinations[3][0]="charleston";
		Destinations[3][1]="columbia";
		Destinations[3][2]="noth ease";
		Destinations[3][3]="south west";
		
		{
			System.out.println(Destinations[3][1]);
		}
		
		
		
		int rows=Destinations.length;
		int cols=Destinations[0].length;
		
		for (int x=0;x<rows;x++) {
		for (int y=0;y<cols;y++) {
			
			System.out.println(Destinations[x][y]);
		}
		}
		
		
		
		
	
		}
		
		
	}

