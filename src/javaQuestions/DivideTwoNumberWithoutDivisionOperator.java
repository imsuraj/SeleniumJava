package javaQuestions;

import java.util.Scanner;

public class DivideTwoNumberWithoutDivisionOperator {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		int a,b;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter first number: ");
		a = keyboard.nextInt();
		System.out.println("Enter second number: ");
		b = keyboard.nextInt();
		if(a<b) {
			System.out.println("Dividend " +a+" is less than divisor " +b);
		}
		else {
			System.out.println("Answer is : "+divideTwoNumber(a,b));
		}
	}


	public static int divideTwoNumber(int dividend, int divisor) {//8, 2

		//int sign = ((dividend < 0) ^  (divisor < 0)) ? -1 : 1; 

		// Update both divisor and 
		// dividend positive 
		//dividend = Math.abs(dividend); 
		//divisor = Math.abs(divisor); 

		// Initialize the quotient 
		int quotient = 0; 


		// Calculate sign of divisor i.e., 
		// sign will be negative only iff 
		// either one of them is negative 
		// otherwise it will be positive 



		while (dividend >= divisor) //8>=2, 6>=2, 4>=2, 2>=2
		{ 
			dividend = dividend - divisor; //8-2=6, 6-2=4, 4-2=2, 2-2=0
			quotient++; //1,2,3, 4
		} 




		//return sign * quotient;
		return quotient;

	}
	
	
	

}
