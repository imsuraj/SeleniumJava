package oOPConceptPart1;

public class Car {
	
	int model;
	int wheel;
	
	public static void main(String[] args) {
		// new Car(); --- this is object of car class
		// new keyword is used to create object,
		// a,b,c are object reference variable
		
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		a.model = 1990;
		a.wheel = 4;
		
		b.model = 1991;
		b.wheel = 4;
		
		c.model = 1992;
		c.wheel = 4;
	
		
		System.out.println(a.model);
		System.out.println(a.wheel);
		
		System.out.println(b.model);
		System.out.println(b.wheel);
		
		System.out.println(c.model);
		System.out.println(c.wheel);
		
		System.out.println("*********");
		a=b;
		b=c;
		c=a;
		a.model=34;
		System.out.println(a.model);
		c.model= 40;
		System.out.println(a.model);
		System.out.println(c.model);
		
		
	}
	
	

}
