package javapractice;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		// A palindrome number is one that remains the same on reversal. Some examples are 8, 121, 212, 12321, -454
		
		checkPalindrome(9);
	}
	
	public static void checkPalindrome(int n) {
		int temp;
		int sum = 0;
		int r;
		
		temp = n;
		
		while(n>0) {
			r = n%10;//1
			
			n = n/10;
			sum = sum * 10 + r;
		}
		if (sum == temp) {
			System.out.println("palin");
		}
		else {
			System.out.println("not");
		}
	}

}
