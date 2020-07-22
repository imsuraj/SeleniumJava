package javapractice;



public class StaticAndNonStatic {

	static int a; //static global variable
	int b ; // non static global variable

	public static void main(String[] args) {
		StaticAndNonStatic object = new StaticAndNonStatic();
		object.nonStaticMethodOne();
	}
	public static void staticMethodOne() {
		System.out.println("staticMethodOne");



		/*
		 * * Non static method inside static method:
		 * 1. Directly not allowed
		 * 2. Using class name not allowed.
		 * 
		 * 
		 * 3. Only using object
		 * 
		 */

		StaticAndNonStatic object = new StaticAndNonStatic();
		object.nonStaticMethodOne();

		/*
		 * Non Static global variable inside static method:
		 * 1. Directly not allowed
		 * 2. Using class name not allowed.
		 * 
		 * 
		 * 3. Only using object
		 * 
		 */

		System.out.println(object.b);


	}

	public static void staticMethodTwo() {

		/* 	 Static method inside static method:
		 * 1. Directly
		 * 2. Using class name.
		 * 3. Using object but throw warning.
		 */
		staticMethodOne();   //1. Directly
		StaticAndNonStatic.staticMethodOne(); //2. Using class name.
		StaticAndNonStatic object = new StaticAndNonStatic(); 
		object.staticMethodOne(); //3. Using object but throw warning.

		/* Static Global Variable inside static method:
		 * 1. Directly
		 * 2. Using class name.
		 * 3. Using object but throw warning.
		 */

		System.out.println(a); //1. Directly
		System.out.println(StaticAndNonStatic.a);//2. Using class name.
		System.out.println(object.a); //3. Using object but throw warning.


	}

	/* 
	 *  * Static method inside non static method:
	 * 1. Directly
	 * 2. Using class name.
	 * 3. Using object but throw warning.
	 */

	public void nonStaticMethodOne() {

		//1. Directly
		staticMethodOne();
		staticMethodTwo();

		// 2. Using class name.
		StaticAndNonStatic.staticMethodOne();
		StaticAndNonStatic.staticMethodTwo();

		//3. Using object but throw warning
		StaticAndNonStatic object = new StaticAndNonStatic();
		object.staticMethodOne();
		object.staticMethodTwo();


		/*
		 *  * Static Global Variable inside non static method:
		 * 1. Directly
		 * 2. Using class name.
		 * 3. Using object but throw warning.
		 */

		//1. Directly
		System.out.println(a);

		//2. Using class name.
		System.out.println(StaticAndNonStatic.a);

		//3. Using object but throw warning.

		System.out.println(object.a);




	}

	public void nonStaticMethodTwo() {

		/*
		 *  * Non static method inside non static method:
		 * 1. Using class name not allowed
		 * 
		 * 
		 * 2. Directly
		 * 3. Using object
		 */

		//2. Directly
		nonStaticMethodOne();
		nonStaticMethodTwo();


		//3. Using object
		StaticAndNonStatic object = new StaticAndNonStatic();

		object.nonStaticMethodOne();
		object.nonStaticMethodTwo();


		/*
		 * 
		 * * Non Static global variable inside non static method:
		 * 1. Directly
		 * 2. Using object
		 *3. Using class name not allowed
		 
		 */
		
		//1. Directly
		System.out.println(b);
		
		//2. Using object
		
		System.out.println(object.b);



	}


}


















