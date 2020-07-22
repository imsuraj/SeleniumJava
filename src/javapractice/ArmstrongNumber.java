package javapractice;

public class ArmstrongNumber {
	//Let's write a java program to check whether the given number is armstrong number or not. 
		//A positive number is called armstrong number if it is equal to the sum of cubes of its digits for example 0, 1, 153, 370, 371, 407 etc.

		//153
		//cube of 1 = 1
		//cube of 5 = 5*5*5=125
		//cube of 3 = 3*3*3=27
		//	sum = 1+125+27 = 153
	
	public static void main(String[] args) {
		checkArmstrongNumber(1);
	}
	
	
	public static void checkArmstrongNumber(int n) {
		
		int temp;
		int r;
		int sum = 0;
		
		temp = n;
		
		
		while(n>0) {
		r = n%10;
		n = n/10;
		sum = (r*r*r) + sum;
		
		
		
		}
		
		if(sum == temp) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not armstrong");
		}
		
	}

}
