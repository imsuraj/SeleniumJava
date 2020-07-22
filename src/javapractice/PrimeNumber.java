package javapractice;

public class PrimeNumber {

	public static void main(String[] args) {

		//Number which is divisible by two numbers(one by 1 and another by itself)

		System.out.println(isPrimeNuber(5));
		printPrimeNumbers(20);
	}


	public static boolean isPrimeNuber(int n) {

		if (n <= 1 ) {
			return false;
		}

		for (int i = 2; i < n; i++) {
			if (n%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void printPrimeNumbers(int n) {
		for (int i = 0; i <= n; i++) {
			if (isPrimeNuber(i)) {
				System.out.println(i + " ");
			}
		}
	}
}

