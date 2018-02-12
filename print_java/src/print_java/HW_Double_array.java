package print_java;

public class HW_Double_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String place[][]= new String[3][2];
		
		//Row1
		place[0][0]="Dallas";
		place[0][1]="Houston";
		//Row2
		place[1][0]="Austin";
		place[1][1]="Plano";
		//Row3
		place[2][0]="Richardson";
		place[2][1]="Mesquite";
		
		{
			System.out.println(place[0][1]);
		}
		
		int row=place.length;
		int colm= place[0].length;
			
		for (int x=0;x<row;x++) {
		for (int y=0;y<colm;y++) {
			
		System.out.println(place[x][y]);
		}
		}
			
			
			
			
		}
		
	}




