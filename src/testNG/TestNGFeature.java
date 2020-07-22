package testNG;

import org.testng.annotations.Test;

public class TestNGFeature {

	
	@Test
	public void loginTest() {
		System.out.println("Login Page test");
		//int i = 9/0;
	}
	
	
	@Test(dependsOnMethods = "loginTest")
	public void homePageTest() {
		System.out.println("HomePage Test");
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void searchPageTest() {
		System.out.println("SearchPage Test");
		//int i = 9/0;
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void regPageTest() {
		System.out.println("RegPage Test");
	}
}
