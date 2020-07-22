package javaQuestions;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

        String word;
        System.out.print("Enter a word: ");

        word = keyboard.nextLine();
        reverseString(word);

	}
	
	public static void reverseString(String word) {
		String rev = "";
		
		for (int i = word.length() - 1; i >= 0; i--) {
			rev = rev + word.charAt(i);
		}
		System.out.println(rev);
		
		if (rev.equals(word)) {
			System.out.println("palindrome word");
		}
		else {
			System.out.println("Not a palindrome word");
		}
	}

}
