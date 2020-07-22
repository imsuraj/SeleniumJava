package javaQuestions;

import java.util.Scanner;

public class DivideTwoNumberWithoutDivisionOperator2 {

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


	public static long divideTwoNumber(long dividend,  long divisor) {
		// Calculate sign of divisor  
		// i.e., sign will be negative  
		// only iff either one of them  
		// is negative otherwise it  
		// will be positive  
		long sign = ((dividend < 0) ^  
				(divisor < 0)) ? -1 : 1;  

		// remove sign of operands  
		dividend = Math.abs(dividend);  
		divisor = Math.abs(divisor);  

		// Initialize the quotient  
		long quotient = 0, temp = 0;  

		// test down from the highest  
		// bit and accumulate the  
		// tentative value for  
		// valid bit  
		// 1<<31 behaves incorrectly and gives Integer 
		// Min Value which should not be the case, instead  
		// 1L<<31 works correctly.  
		for (int i = 31; i >= 0; --i)  
		{  

			if (temp + (divisor << i) <= dividend)  
			{  
				temp += divisor << i;  
				quotient |= 1L << i;  
			}  
		}  

		return (sign * quotient);  
	} 
}

