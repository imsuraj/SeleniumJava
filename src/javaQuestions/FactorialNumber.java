package javaQuestions;

public class FactorialNumber {

	/*Factorial of n is the product of all positive descending integers. Factorial of n is denoted by n!. For example:
		0! = 1
		4! = 4*3*2*1 = 24  
		5! = 5*4*3*2*1 = 120  */

	public static void main(String[] args) {
		System.out.println("Factorial is: "+findFactorial(0));
		System.out.println("Factorial is: "+findFactorial(1));
		System.out.println("Factorial is: "+findFactorial(30));
		System.out.println("Factorial is: "+findFactorial(8));
		System.out.println("Factorial is: "+findFactorial(10));
		System.out.println("Factorial is: "+findFactorial(23));
		System.out.println("***********************");

		System.out.println("Factorial is: "+recursiveFactorial(0));
		System.out.println("Factorial is: "+recursiveFactorial(1));
		System.out.println("Factorial is: "+recursiveFactorial(30));
		System.out.println("Factorial is: "+recursiveFactorial(8));
		System.out.println("Factorial is: "+recursiveFactorial(10));
		System.out.println("Factorial is: "+recursiveFactorial(23));

	}

	public static int findFactorial(int n) {// 5, 
		int fact = 1;
		for (int i = 1; i <= n; i++) { //1<=5, 2<=5, 3<=5, 4<=5, 5<=5, 6<=5
			fact = fact * i;// 1*1 = 1, 1*2=2, 2*3=6, 6*4=24, 24*5=120
			//System.out.print(fact+" * ");
		}
		return fact;
	}


	//with recursive function.. function calling itself

	public static int recursiveFactorial(int num) {

		if (num == 0) {
			return 1;

		}else {
			return (num * recursiveFactorial(num -1));
		}

	}

}
