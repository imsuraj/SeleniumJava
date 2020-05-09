package javaBasics;

public class ArrayConcept {
	public static void main(String[] args) {
		
		
		//disadvantages of array
		//1. size is fixed -- static array -- use collections--- ArrayList, hashTable -- use dynamic
		
		//2. stores only similar data types -- Use Object array to overcome this problem.
		
		
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;



		System.out.println(i[2]);
		System.out.println(i[3]);
		
		System.out.println(i.length);
		
		System.out.println("***********");
		
		//print all the values of array: use for loop
		
		for (int j = 0; j < i.length; j++) {
			System.out.println(j);
		}
		
		//double array
		
		double d[] = new double[3];
		d[0]=12.22;
		d[1]=13.33;
		d[2]=14.44;
		
		//char array
		
		double c[]=new double[3];
		c[0]='a';
		c[1]='b';
		c[2]='c';
		
		
		//boolean array
		
		boolean b[]=new boolean[2];
		b[0]=true;
		b[1]=false;
		
		
		//string array;
		
		String s[]=new String[2];
		s[0]="suraj";
		s[1]="samridh";
		
		System.out.println(s.length);
		System.out.println(s[1]);
		
		
		//6. Object Array(Object is a class) - is used to store different data types value,
		
		
		Object ob[]=new Object[6];
		ob[0]="Tom";
		ob[1] = 25;
		ob[2] = 12.33;
		ob[3] = "1/1/1990";
		ob[4] = 'M';
		ob[5] = "kathmandu";
		
		System.out.println(ob[5]);
		System.out.println(ob.length);
		
		for (int j = 0; j < ob.length; j++) {
			System.out.println(ob[j]);
		}
				
		
		
		
		
				

	}
}
