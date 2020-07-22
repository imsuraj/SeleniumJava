package com.datadriventest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.excel.utility.Xls_Reader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterizeTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//goto url
		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru=");

		//get test data from excel
		Xls_Reader reader = new Xls_Reader("/Users/Suraj/JavaProjects/Selenium/src/com/testdata/HalfEbayTestData.xlsx");

		int rowCount = reader.getRowCount("RegTestData");
		
		
		reader.addColumn("RegTestData", "Remarks");
		for(int rowNum = 2; rowNum<=rowCount; rowNum++) {
			String firstName = reader.getCellData("RegTestData", "firstName", rowNum);
			System.out.println(firstName);
			

			String lastName = reader.getCellData("RegTestData", "lastName", rowNum);
			System.out.println(lastName);
			
			String address1 = reader.getCellData("RegTestData", "address1", rowNum);
			System.out.println(address1);
			
			String address2 = reader.getCellData("RegTestData", "address2", rowNum);
			System.out.println(address2);
			
			String city = reader.getCellData("RegTestData", "city", rowNum);
			System.out.println(city);
			
			String state = reader.getCellData("RegTestData", "state", rowNum);
			System.out.println(state);
			
			String zipcode = reader.getCellData("RegTestData", "zipcode", rowNum);
			System.out.println(zipcode);
			
			String emailAddress = reader.getCellData("RegTestData", "emailAddress", rowNum);
			System.out.println(emailAddress);
			System.out.println("");

			
			
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

			driver.findElement(By.id("dayphone1")).sendKeys("123");

			driver.findElement(By.id("dayphone2")).sendKeys("456");

			driver.findElement(By.id("dayphone3")).sendKeys("7890");

			driver.findElement(By.id("dayphone4")).sendKeys("121");

			driver.findElement(By.id("email")).clear();
			driver.findElement(By.id("email")).sendKeys(emailAddress);
			
			driver.findElement(By.id("retype_email")).clear();
			driver.findElement(By.id("retype_email")).sendKeys(emailAddress);

			driver.findElement(By.id("userid")).sendKeys("suraj20192020");

			driver.findElement(By.id("PASSWORD")).sendKeys("Suchana@123");


			driver.findElement(By.id("rpass")).sendKeys("Suchana@123");



			Select select1 = new Select(driver.findElement(By.id("SECRET_QUESTION")));
			select1.selectByVisibleText("What is your pet's name?");


			driver.findElement(By.id("SECRET_ANSWER")).sendKeys("rabbit");

			Select select2 = new Select(driver.findElement(By.id("birthdate2")));
			select2.selectByVisibleText("February");

			Select select3 = new Select(driver.findElement(By.id("birthdate1")));
			select3.selectByVisibleText("02");

			Select select4 = new Select(driver.findElement(By.id("birthdate3")));
			select4.selectByVisibleText("1976");
			
			reader.setCellData("RegTestData", "Remarks", rowNum, "Pass");


//			driver.findElement(By.id("acceptq1")).sendKeys(Keys.SPACE);
			
			
			
			//driver.quit();

		}
	}
}
