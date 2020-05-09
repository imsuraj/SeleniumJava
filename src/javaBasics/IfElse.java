package javaBasics;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 20;
		
		if (b>a) {
			System.out.println("b is greater than a");
			
		}
		else {
			System.out.println("a is greater than b");
		}
		
		int c = 11;
		
		if (c==10) {
			System.out.println("pass");
			
		}
		else {
			System.out.println("fail");
		}
		
		int p = 5;
		int q = 25;
		int z = p+ q;
		
		if (z>=30) {
			System.out.println("pass");
			
		}
		else {
			System.out.println("fail");
		}
		
		
		int a1 = 400;
		int a2 = 500;
		int a3 = 300;
		
		if (a1>a2 & a1>a3) {
			System.out.println("a1 is greatest");
			
		}
		else if (a2>a3) {
			System.out.println("a2 is greatest");
		}
		else {
			System.out.println("a3 is greatest");
		}
	}

}
