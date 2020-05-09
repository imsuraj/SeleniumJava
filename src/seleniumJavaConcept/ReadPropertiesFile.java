package seleniumJavaConcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadPropertiesFile {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
	
		
		Properties prop = new Properties();
		
		FileInputStream ip = new FileInputStream("/Users/suraj/JavaProjects/Selenium/src/seleniumJavaConcept/config.properties");
		
		
		prop.load(ip);
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
				
		String url = prop.getProperty("url");
		
		System.out.println(url);
		
		String browserName = prop.getProperty("browser");
		
		System.out.println(browserName);
		
		
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();

		 driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}
		
		else if (browserName.equalsIgnoreCase("IE")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			
		}
		
		driver.get(url);
		
		

		driver.findElement(By.xpath(prop.getProperty("firstname_xpath"))).sendKeys(prop.getProperty("firstName"));
		
		driver.findElement(By.xpath(prop.getProperty("lastname_xpath"))).sendKeys(prop.getProperty("lastName"));

		driver.findElement(By.xpath(prop.getProperty("city_xpath"))).sendKeys(prop.getProperty("city"));
		
	}

}
