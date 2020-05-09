package seleniumJavaConcept;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotHandle {

	static WebDriver driver = null;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		takeScreenshot("facebook_loginPage");
		System.out.println("Test Completed");

	}
	
	public static void takeScreenshot(String fileName) throws IOException {
		
		//1. Take screenshot and store as a file formant
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// now copy the screenshot to desired location using copyFile //method
		
		FileUtils.copyFile(src, new File("/Users/suraj/JavaProjects/Selenium/src/seleniumJavaConcept/"+fileName+".png"));

		
	}

}
