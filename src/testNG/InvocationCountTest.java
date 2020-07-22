package testNG;

import org.testng.annotations.Test;

public class InvocationCountTest {
	//run test 5 times... useful when you want to run same test multiple time or to load data in database
	@Test(invocationCount = 5)
	public void sum() {
		int a = 10;
		int b = 20;
		int c = a + b;
		
		System.out.println("Sum = "+c);
	}
	

}
