package oOPConceptPart1;

public class CallByVallueAndCallByRef {
	
	
	int p;
	int q;

	public static void main(String[] args) {
	
		CallByVallueAndCallByRef object = new CallByVallueAndCallByRef();
		int x = 10;
		int y = 20;
		object.testSum(x, y);//call by value or pass by value
		
		object.p=50;
		object.q=60;
		
		object.swap(object);
		
		System.out.println(object.p);
		System.out.println(object.q);
		
		
	}

	//
	public int testSum(int a, int b) {
		a= 30;
		b=40;
		int c = a +b;
		return c;
		
	}
	//call by reference
	public void swap(CallByVallueAndCallByRef t) {
		int temp;
		temp = t.p; // temp 50
		t.p =t.q; // t.p 60
		t.q = temp; // t.q 50
		
	}
}
