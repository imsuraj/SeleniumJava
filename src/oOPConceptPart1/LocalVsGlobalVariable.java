package oOPConceptPart1;

public class LocalVsGlobalVariable {


	//Global variable-- class variable
	String name = "TOM";
	int age = 25;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i =  10; //Local variable.
		
		System.out.println(i);
		
		LocalVsGlobalVariable object = new LocalVsGlobalVariable();
		System.out.println(object.name);
		System.out.println(object.age);


	}
	
	public void sum() {
		int i = 15;// local variable for sum method.
		int j = 20;
		
	}

}
