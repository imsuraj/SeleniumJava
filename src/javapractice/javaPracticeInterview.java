package javapractice;

public class javaPracticeInterview {
	public static void main(String[] args) {
		divide(95,5);
		System.out.println("***********");
		checkArmstrong(151);
		System.out.println("***********");
		
		//System.out.println(11%10);
		
		factorial(5);
		System.out.println("***********");
		System.out.println(recursiveFactorial(5));
		System.out.println("***********");
		isPalindromeCheck(122);
		System.out.println("***********");
		System.out.println(isPrimeNumber(4));
		System.out.println("***********");
		getPrimeNumber(20);
		
	}
	
	public static void divide(int divisor, int dividor) {
		
		int flag = 0;
		while(divisor>=dividor) {
			divisor = divisor - dividor;
			flag = flag + 1;
		}
		
		System.out.println("Answer " +flag);
	}
	
	
	public static void checkArmstrong(int num) {
		//Let's write a java program to check whether the given number is armstrong number or not. 
		//A positive number is called armstrong number if it is equal to the sum of cubes of its digits for example 0, 1, 153, 370, 371, 407 etc.

		//153
		//cube of 1 = 1
		//cube of 5 = 5*5*5=125
		//cube of 3 = 3*3*3=27
		//	sum = 1+125+27 = 153
		
		
		int temp;
		int sum = 0;
		int rem;
		temp = num;
		
		while(num>0) {
			rem = num % 10;
			num = num/10;
			sum = sum + (rem * rem * rem);
		}

		
		if (sum == temp) {
			System.out.println("Armstromg");
		}
		else {
			System.out.println("Not armstrong");
		}
	}
	
	public static void factorial(int num) {
		double fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}
	
	public static int recursiveFactorial(int num) {
		if (num == 0) {
			return 1;
		}
		else {
			return (num * recursiveFactorial(num-1));
		}
		
	}

	public static void isPalindromeCheck(int num) {
		int temp;
		int sum = 0;
		int rem;
		
		temp = num;
		
		while(num > 0) {
			rem = num % 10;
			num = num /10;
			sum = sum * 10 + rem;
		}
		
		if (sum == temp) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
	}

	public static boolean isPrimeNumber(int num) {
		//Number which is divisible by two numbers(one by 1 and another by itself)
		
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
				
	}
	
	public static void getPrimeNumber(int num) {
		for (int i = 0; i <=num; i++) {
			if(isPrimeNumber(i)) {
				System.out.println(i);
			}
		}
	}
}