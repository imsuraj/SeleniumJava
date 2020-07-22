package javaQuestions;

import java.util.Scanner;

public class MultplicationTable {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);

        int num;
        System.out.print("Enter a number: ");

        num = keyboard.nextInt();
		multiplication(num);
	}
	
	public static void multiplication(int num) {
	
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d * %d = %d \n", num, i, num * i);
		}
	}

}
