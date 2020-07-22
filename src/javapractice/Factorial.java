package javapractice;

public class Factorial {

	/*Factorial of n is the product of all positive descending integers. Factorial of n is denoted by n!. For example:
	0! = 1
	4! = 4*3*2*1 = 24  
	5! = 5*4*3*2*1 = 120  */
	
	public static void main(String[] args) {
		factorial(4);
		System.out.println(recursiveFact(4));
	}
	
	
	
	public static void factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		
		System.out.println(fact);
	}
	
	public static int recursiveFact(int n) {
		if (n == 0) {
			return 1;
		}else {
		return (n  * recursiveFact(n-1));
	}
}
}

