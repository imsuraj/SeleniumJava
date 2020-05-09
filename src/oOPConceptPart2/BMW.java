package oOPConceptPart2;

public class BMW extends Car{


	//Method Overriding:
	//when the method name is same with the same number of arguments
	//in parent class as well as in child class
	public void start() {
		System.out.println("BMW Starts");
	}


	public void theftSafety() {
		System.out.println("BMW Saftey feature");
	}
}
