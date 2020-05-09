package oOPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading object = new MethodOverloading();
		object.sum();
		object.sum(10);
		object.sum(10, 20);
		
	}
	
	//we can overload main method also
	//you cannot create a method inside a method
	//duplicate method -- ie some method name with same number of argument are not allowed.
	
	
	
	//method overloading--- when the method name is same with different arguments or input parameters within same class
	public void sum() {// 0 input parameter
		System.out.println("SUm Method--- zero para");
		
		
	}
	
	public void sum(int i) {//1 input parameter
		System.out.println("Sum Method-- 1 para");
		System.out.println(i);
	}
	
	
	public void sum(int k, int l) {//2 input parameter
		System.out.println("sum method -- 2 para ");
		System.out.println("sum "+ (k+l));
	}
}
