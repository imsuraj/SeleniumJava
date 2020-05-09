package javaBasics;

public class StaticAndNonStaticConcept {
	//Global variable--- scope of global variable will be available across all the functions with some conditions
	String name ="Tom";// this is not static global variable
	
	static int age = 25;//this is static variable
	public static void main(String[] args) {
		// how to call static methods and variables
		//1. direct calling
		sum();
		
		//2. calling by classname
		
		StaticAndNonStaticConcept.sum();
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);
		
		
		//how to call non static methods and variables
		StaticAndNonStaticConcept object = new StaticAndNonStaticConcept();
		object.sendMail();
		System.out.println(object.name);
		
		
		//can i access static methods by using object reference? yes but not a good practice.
		
		object.sum();
		
	}
	
	public void sendMail() {
		System.out.println("send email method");
	}

	public static void sum() {
		System.out.println("this is sum method");
	}
}


/*Summary: To access static and non static inside each other,
 * Static method inside static method:
 * 1. Directly
 * 2. Using class name.
 * 3. Using object but throw warning.
 * 
 * Static Global Variable inside static method:
 * 1. Directly
 * 2. Using class name.
 * 3. Using object but throw warning. 
 * 
 * Static method inside non static method:
 * 1. Directly
 * 2. Using class name.
 * 3. Using object but throw warning.
 * 
 * Static Global Variable inside non static method:
 * 1. Directly
 * 2. Using class name.
 * 3. Using object but throw warning. 
 * 
 * Non static method inside static method:
 * 1. Only using object
 * 
 * Non Static global variable inside static method:
 * 1. Only using object
 * 
 * Non static method inside non static method:
 * 1. Directly
 * 2. Using object
 * 
 * Non Static global variable inside non static method:
 * 1. Directly
 * 2. Using object
 */