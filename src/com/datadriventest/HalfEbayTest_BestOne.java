package com.datadriventest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.utility.TestUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HalfEbayTest_BestOne {

	WebDriver driver ;
	
	String sheetName = "Sheet1";

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru=");	//enter url
	}


	

	
	@DataProvider
	public Object[][] getData() throws Exception {
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}

	
	
	
	@Test(dataProvider = "getData")
	public void testInterConversion(String zipcode, String	dayphone1, String	dayphone2, String	dayphone3, String	dayphone4, String	birthdate1,
			String birthdate3) {
		
		System.out.println("--------------");
		System.out.println(zipcode);
		System.out.println((int) Double.parseDouble(zipcode));
		
		System.out.println(dayphone1);
		System.out.println((int) Double.parseDouble(dayphone1));
		
		System.out.println(dayphone2);
		System.out.println((int) Double.parseDouble(dayphone2));
		
		System.out.println(dayphone3);
		System.out.println((int) Double.parseDouble(dayphone3));
		
		System.out.println(dayphone4);
		System.out.println((int) Double.parseDouble(dayphone4));
		
		System.out.println(birthdate1);
		System.out.println((int) Double.parseDouble(birthdate1));
		
		System.out.println(birthdate3);
		System.out.println((int) Double.parseDouble(birthdate3));
	}
	
	
	
	@Test(dataProvider = "getData")
	public void registerHalfEbay(String firstName, String lastName, String address1, String address2, String city, String state, String zipcode, String dayphone1,
			String dayphone2, String dayphone3, String dayphone4, String emailAddress, String SECRET_ANSWER, String birthdate2,
			String birthdate1, String birthdate3) {
		

		
		
		
		driver.findElement(By.id("firstname")).clear();
		driver.findElement(By.id("firstname")).sendKeys(firstName);

		driver.findElement(By.id("lastname")).clear();
		driver.findElement(By.id("lastname")).sendKeys(lastName);
		
		driver.findElement(By.id("address1")).clear();
		driver.findElement(By.id("address1")).sendKeys(address1);
		
		driver.findElement(By.id("address2")).clear();
		driver.findElement(By.id("address2")).sendKeys(address2);

		driver.findElement(By.id("city")).clear();
		driver.findElement(By.id("city")).sendKeys(city);


		//handle drop box:
		Select select = new Select(driver.findElement(By.id("state")));
		select.selectByVisibleText(state);
		
		driver.findElement(By.id("zip")).clear();
		driver.findElement(By.id("zip")).sendKeys(zipcode);
		
		driver.findElement(By.id("dayphone1")).clear();
		driver.findElement(By.id("dayphone1")).sendKeys(dayphone1);

		driver.findElement(By.id("dayphone2")).clear();
		driver.findElement(By.id("dayphone2")).sendKeys(dayphone2);

		driver.findElement(By.id("dayphone3")).clear();
		driver.findElement(By.id("dayphone3")).sendKeys(dayphone3);

		driver.findElement(By.id("dayphone4")).clear();
		driver.findElement(By.id("dayphone4")).sendKeys(dayphone4);

		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(emailAddress);
		
		driver.findElement(By.id("retype_email")).clear();
		driver.findElement(By.id("retype_email")).sendKeys(emailAddress);
		
//		driver.findElement(By.id("userid")).clear();
//		driver.findElement(By.id("userid")).sendKeys(userid);
//
//		driver.findElement(By.id("PASSWORD")).clear();
//		driver.findElement(By.id("PASSWORD")).sendKeys(PASSWORD);
//
//		driver.findElement(By.id("rpass")).clear();
//		driver.findElement(By.id("rpass")).sendKeys(PASSWORD);



		Select select1 = new Select(driver.findElement(By.id("SECRET_QUESTION")));
		select1.selectByVisibleText("What is your pet's name?");

		driver.findElement(By.id("SECRET_ANSWER")).clear();
		driver.findElement(By.id("SECRET_ANSWER")).sendKeys(SECRET_ANSWER);

		Select select2 = new Select(driver.findElement(By.id("birthdate2")));
		select2.selectByVisibleText(birthdate2);
		

		Select select3 = new Select(driver.findElement(By.id("birthdate1")));
		select3.selectByVisibleText(String.valueOf(birthdate1));

		Select select4 = new Select(driver.findElement(By.id("birthdate3")));
		select4.selectByVisibleText(String.valueOf(birthdate3));

		//	driver.findElement(By.id("acceptq1")).sendKeys(Keys.SPACE);


	}

//
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
