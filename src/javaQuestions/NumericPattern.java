package javaQuestions;

public class NumericPattern {
	
	//	1
	//	1 2
	//	1 2 3
	//	1 2 3 4

	public static void numericPatternOne(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

	//	1
	//	2 2 
	//	3 3 3
	//	4 4 4 4
	public static void numericPatternTwo(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}


	//	1
	//	2 3
	//	4 5 6
	//	7 8 9 10

	public static void numericPatternThree(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <=i; j++) {
				count = count + 1;
				System.out.print(count+" ");
			}
			System.out.println();
		}
	}


	//	1
	//	2 1
	//	3 2 1
	//	4 3 2 1
	//	5 4 3 2 1


	public static void numericPatternFour(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = i; j >=1; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}



	//	1
	//	1 2 1
	//	1 2 3 2 1
	//	1 2 3 4 3 2 1


	public static void numericPatternFive(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(j+" ");
			}
			for (int k = i-1; k >=1; k--) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}



	//	5 4 3 2 1
	//	5 4 3 2
	//	5 4 3 
	//	5 4
	//	5


	public static void numericPatternSix(int n) {
		for (int i = 1; i <=n; i++){
			for (int j = n; j >=i; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	
	
//	1
//	2 6 
//	3 7 10 
//	4 8 11 13
//	5 9 12 14 15
	
	
	public static void numericPatternSeven(int n) {
		
		for (int i = 1; i <=n; i++){
			int num = i;
			for (int j = 1; j <=i; j++) {
				System.out.print(num+" ");
				num = num + 5 - j;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		numericPatternSeven(5);
	}

}
