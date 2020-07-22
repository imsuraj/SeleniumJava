package javaBasics;

public class DataTypes {

	public static void main(String[] args) {
		//primitive data types: int, double, char, boolean
		//1. int:
		int i =10;
		i = 20;
		i = 30;
		int j = 40;
		int	k = -40;
		System.out.println(i);
		System.out.println(j);
		System.out.println(k+i);
		
		//2. double:
		double d = 12.33;
		double d1 = 34.44;
		double d2 = 10;
		
		System.out.println(d);
		System.out.println(d1);
		System.out.println(d2);
		
		//3. char: only single digit value
		char c = 'a';
		char c1 = 'A';
		char c2 = '1';
		char c3 = '$';
		
		System.out.println(c);
		System.out.println(c1);
		
		
		//4. boolean:
		boolean b1 = true;
		boolean b2 =false;
		
		//5. String: is a class , not a data type(can write anything inside "")
		
		String s = "Suraj";
		String s1 = "Anand";
		String s3 = "1000.00";
		
		int i1 = (int) Double.parseDouble(s3);
		System.out.println(i1);
		System.out.println(s3);
		
		
				

	}


}
