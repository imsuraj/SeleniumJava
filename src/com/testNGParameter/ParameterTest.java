package com.testNGParameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterTest {
	
	WebDriver driver;
	
	@Test
	@Parameters(value = {"url","email_id"})
	public void yahooLoginTest(String url, String email_id) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get(url);
		
		driver.findElement(By.id("login-username")).clear();
		driver.findElement(By.id("login-username")).sendKeys(email_id);
		
		
		driver.findElement(By.id("login-signin")).click();
		
		
		driver.quit();
	}
}
