package javaQuestions;

public class PrimeNumber {


	//Number which is divisible by two numbers(one by 1 and another by itself)
	public static void main(String[] args) {
		
		//		System.out.println("2 is prime number : "+ isPrimeNumber(2));
		//		System.out.println("3 is prime number : "+ isPrimeNumber(3));
		//		System.out.println("4 is prime number : "+ isPrimeNumber(4));
		//		System.out.println("10 is prime number : "+ isPrimeNumber(10));
		//		System.out.println("17 is prime number : "+ isPrimeNumber(17));
		//		System.out.println("0 is prime number : "+ isPrimeNumber(0));
		//		System.out.println("1 is prime number : "+ isPrimeNumber(1));
		//		System.out.println("-3 is prime number : "+ isPrimeNumber(-3));
		//		getPrimeNumbers(7);
		//		getPrimeNumbers(13);
		
//		int num = 20;
//		getPrimeNumbers(num);
//		System.out.println("are prime numbers upto " + num);

		//System.out.println("11 is prime number : "+ isPrimeNumber(11));
		
//		System.out.println("1 is prime number : "+ primeNumberCheck(109));
		printPrimeNumber(20);
		getPrimeNumbers(20);
		System.out.println(isPrimeNumber(3));


	}


	//Method to check if number is prime number??
	public static boolean isPrimeNumber(int num) {

		if (num<=1) {
			return false;
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}


	public static void getPrimeNumbers(int num) {

		
		for (int i = 2; i <= num; i++) {
			if (isPrimeNumber(i)) {
				System.out.print(i + ", ");

			}
		}

	}
	
	
	
	
	//Number which is divisible by two numbers(one by 1 and another by itself)
	//Number begining from 2
	//Write a program to check if the given number is prime number.
	
	
	public static boolean primeNumberCheck(int num) {
		if(num<=1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	//Write a program to print prime number upto given number.
	public static void printPrimeNumber(int num) {
		for (int i = 2; i <=num; i++) {
			if(primeNumberCheck(i)) {
				System.out.println(i +" ");
			}
			
		}
	}
	
	
	
}
