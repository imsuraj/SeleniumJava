package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("@BeforeSuite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("@BeforeTest");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("@BeforeClass");
	}
	
	
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("@BeforeMethod");
	}
	
	
	
	@Test(priority = 1, groups = "sanity")
	public void Test1() {
		System.out.println("@Test1");
	}
	
	
	@Test(priority = 2, groups = "sanity")
	public void Test2() {
		System.out.println("@Test2");
	}
	
	@Test(priority = 3, groups = "reg")
	public void Test3() {
		System.out.println("@Test3");
	}
	
	
	@Test(priority = 4, groups = "reg")
	public void Test5() {
		System.out.println("@Test5");
	}
	
	@Test(priority = 5, groups = "sanity")
	public void Test4() {
		System.out.println("@Test4");
	}
	

	
	@AfterMethod
	public void afterMethod() {
		System.out.println("@AfterMethod");
	}
	
	
	@AfterClass
	public void afterClass() {
		System.out.println("@AfterClass");
	}
	
	
	
	
	@AfterTest
	public void afterTest() {
		System.out.println("@AfterTest");
	}
	
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("AfterSuite");
	}

}
