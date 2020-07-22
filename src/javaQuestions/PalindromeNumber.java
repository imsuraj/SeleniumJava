package javaQuestions;

public class PalindromeNumber {

	// A palindrome number is one that remains the same on reversal. Some examples are 8, 121, 212, 12321, -454

	public static void main(String[] args) {
		//		isPalindromeNumber(151);
		//		isPalindromeNumber(152);
		//		isPalindromeNumber(789987);
		//isStringReverse("teet d");
		checkPalindromeNumber(0);



	}




	public static void isPalindromeNumber(int num) {
		System.out.println("Given number is :"+num);
		int remainder = 0;
		int sum = 0;
		int temp;

		temp = num;
		while (num > 0) {
			remainder = num%10;
			sum = (sum*10)+remainder;
			num = num/10;
		}

		if (temp == sum	) {
			System.out.println("Palindrome Number");
		}
		else {
			System.out.println("Not a palindrome number");
		}


	}


	public static void isStringReverse(String string){
		String t;
		t=string;


		StringBuffer reversestring = new StringBuffer(String.valueOf(string)).reverse();
		System.out.println(reversestring);
		if(t.contentEquals(reversestring)) {
			System.out.println("It is a PALINDROME");
		}
		else {
			System.out.println("It is NOT a PALINDROME");
		}


	}

	//write a program to check if the given number is palindrome or not
	// A palindrome number is one that remains the same on reversal. Some examples are 8, 121, 212, 12321, -454


	public static void checkPalindromeNumber(int num) {
		System.out.println("Givem number is: "+num);//121
		int sum = 0;
		int r = 0;
		int t ;

		t = num;//t = 121

		while (num>0) {//121>0,,,, 12>0,,,,1>0,,,,0>0(exit while loop)
			r = num%10; //r = 121%10 ==1, r=1,,,,r = 12%10=2,,,, r = 1%10 = 1
			sum = sum *10 + r;// sum = 0*10 + 1 = 1,,,,1*10+2=12,,,,r = 12*10+1=121
			num = num/10;// num = 121/10, num = 12,,,,num = 12/10=1,,,,1/10=0

		}

		if (sum == t) {//121==121
			System.out.println("Number is palindrome");///will print this
		}else {
			System.out.println("Number is not palindrome");
		}

	}


}
