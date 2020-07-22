package javaQuestions;

public class PrintStar {
	public static void main(String[] args) {
		//		starPatternOne();
		//		
		//		System.out.println("=============");
		//		starPatternTwo();
		//		
		//		System.out.println("=============");
		//		starPatternThree();
		//		
		//		System.out.println("=============");
		//		starPatternFour();

		//		System.out.println("=============");
		//		starPatternFive();

		//		System.out.println("=============");
		//		starPatternSix();

//		starPatternSeven();
//		starPatternEight();
		
		starPatternNine();
		
		System.out.println("=============");
		starPatternTen();


	}


	public static void starPatternOne() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void starPatternTwo() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j >=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}


	public static void starPatternThree() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 1; i <= 4; i++) {
			for (int j = 3; j >=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void starPatternFour() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 3; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}


	public static void starPatternFive() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 2; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 4; k >=i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void starPatternSix() {
		for (int i = 1; i <=5; i++) {
			for (int j = 4; j >=i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(" ");

			}
			for (int k = 4; k >=i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void starPatternSeven() {
		for (int i = 1; i <=4; i++) {
			for (int j = 4; j >=i; j--) {
				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

	public static void starPatternEight() {
		for (int i = 1; i <=4; i++) {
			for (int j = 4; j >=1; j--) {
				if (j > i) {
					System.out.print(" ");
				}else {
					System.out.print(" *");
				}

			}


			System.out.println();
		}
	}
	
	
	
	public static void starPatternNine() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			for (int l = 2; l <=i; l++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	
	public static void starPatternTen() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");//****
			}
			for (int k = 4; k >= i; k--) {
				System.out.print("*");
			}
			for (int l = 3; l >=i; l--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}






