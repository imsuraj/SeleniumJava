package javaBasics;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x[][]= new String[3][5];
		
		System.out.println(x.length); 		// total number of rows
		System.out.println(x[0].length);	// total number of cols
		
		x[0][0]="A0";
		x[0][1]="B0";
		x[0][2]="C0";
		x[0][3]="D0";
		x[0][4]="E0";
		
		x[1][0]="A1";
		x[1][1]="B1";
		x[1][2]="C1";
		x[1][3]="D1";
		x[1][4]="E1";
		
		
		x[2][0]="A2";
		x[2][1]="B2";
		x[2][2]="C2";
		x[2][3]="D2";
		x[2][4]="E2";
		
		
		//System.out.println(x[1][2]);
		
		
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[0].length; j++) {
			System.out.print(x[i][j]);
			System.out.print("   ");
			}
			System.out.println("");
		}
	}

}
