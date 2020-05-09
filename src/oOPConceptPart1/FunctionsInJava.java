package oOPConceptPart1;

public class FunctionsInJava {
	//main method is starting point of execution
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	FunctionsInJava object = new FunctionsInJava();
	//one object will be created, object is a reference variable , refering to the object.
	//after creating the object, the copy of all non static methods will be given to this object
	
	
	object.test();
	
	int a=object.test2();
	System.out.println(a);
	
	String b = object.qa();
	System.out.println(b);

	int c = object.division(30, 5);
	System.out.println(c);
	
	//main method is void because it never returns a value
	}
	
	//non static method
	// return type is void -- does not return any value
	public void test() {// no input no output
		System.out.println("Test method");
		
	}
	
	
	//return type is int
	public int test2() {// no input, some output
		System.out.println("Test2 Method");
		int a = 20;
		int b = 30;
		int c = a + b;
		
		return c;
	}
	
	
	// return type String
	public String qa() {// no input, some output
		System.out.println("QA Mehtod");
		String s = "Selenium";
		
		return s;
	}
	
	// return type int
	// i, j are input parameteres/arguments
	public int division(int i, int j) {
		System.out.println("Division");
		int d = i/j;
		return d;
	}
}
