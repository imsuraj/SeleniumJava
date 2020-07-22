package oOPConceptPart2;

public class AnimalMethod {
	
	String color;
	int age;
	
	
	public void initObject(String c, int a) {
		color = c;
		age = a;
	}
	
	
	public void display() {
		System.out.println(color + " " + age);
	}
	public static void main(String[] args) {
		AnimalMethod buzo = new AnimalMethod();
		buzo.initObject("red", 3);
		buzo.display();
	}

}
