package javaQuestions;

public class ArmstrongNumber {
	//Let's write a java program to check whether the given number is armstrong number or not. 
	//A positive number is called armstrong number if it is equal to the sum of cubes of its digits for example 0, 1, 153, 370, 371, 407 etc.

	//153
	//cube of 1 = 1
	//cube of 5 = 5*5*5=125
	//cube of 3 = 3*3*3=27
	//	sum = 1+125+27 = 153


	public static void main(String[] args) {
		//		isArmstrongNumber(153);
		//		isArmstrongNumber(155);
		//		isArmstrongNumber(-1);
		//checkArmstrongNumber(153);
//		checkArmstrongNumber(455);
//		checkArmstrongNumber(1634);
		
		allDigitArmstrongNumber(-1);
	}




	public static void checkArmstrongNumber(int num) {
		System.out.println("Given Number is :"+num);
		int temp;
		int r;
		int cube = 0;

		temp = num; // temp = 153

		while(num>0) {//153>0, 
			r = num%10;// r = 153%10, r=3
			num = num/10;// num = 153/10, num = 15
			cube = cube + (r*r*r);// cube = 0 +(3*3*3), cube = 27
		}

		if (cube == temp) {
			System.out.println("Armstrong Number");
		}else {
			System.out.println("Not an Armstrong Number");
		}

	}




	public static void isArmstrongNumber(int num) {
		System.out.println("Given number is: "+num);
		int temp;
		int cube = 0;
		int reminder;

		temp = num;

		while (num>0) {
			reminder = num%10;
			num = num/10;
			cube = cube+(reminder * reminder * reminder);
		}

		if (cube == temp) {
			System.out.println("This number is a armstrong number.");
		}
		else {
			System.out.println("This number is not a armstrong number.");
		}

	}

	public static void allDigitArmstrongNumber(int armX) {
		//int armX = 54748; //You can give any number.
		int finalNum=0;
		if (armX<0) {
			System.out.println(armX+ " is not armstrong number");
		}
		for(int i=0;i<Integer.toString(armX).length();i++) {	    		
			finalNum = finalNum+
					(int)Math.pow(Integer.parseInt("" + Integer.toString(armX).charAt(i)), Integer.toString(armX).length());;}
		if(armX==finalNum) {
			System.out.println(armX+ " is armstrong number");
		}else {
			System.out.println(armX+ " is not armstrong number");
		}
	}

}
