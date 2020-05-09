package seleniumJavaConcept;

//import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropBox {
	

	public static void main(String[] args) throws Exception {
		
		//BasicConfigurator.configure();
		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "/Users/suraj/JavaProjects/Selenium/driver/chromedriver/chromedriver");	
		WebDriver driver = new ChromeDriver(); //launch chrome
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru=");	//enter url
		
		driver.findElement(By.id("firstname")).sendKeys("Suraj");
		
		driver.findElement(By.id("lastname")).sendKeys("Anand");
		
		driver.findElement(By.id("address1")).sendKeys("Kathmandu");
		driver.findElement(By.id("address2")).sendKeys("Nepal");
		
		
		driver.findElement(By.id("city")).sendKeys("lalitpur");
		
		

		//handle drop box:
		Select select = new Select(driver.findElement(By.id("state")));
		select.selectByVisibleText("California");
		
		driver.findElement(By.id("zip")).sendKeys("1000");
		
		driver.findElement(By.id("dayphone1")).sendKeys("123");
		
		driver.findElement(By.id("dayphone2")).sendKeys("456");
		
		driver.findElement(By.id("dayphone3")).sendKeys("7890");
		
		driver.findElement(By.id("dayphone4")).sendKeys("121");
		
		
		driver.findElement(By.id("email")).sendKeys("abc@xyz.com");
		
		driver.findElement(By.id("retype_email")).sendKeys("abc@xyz.com");
		
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

		
		driver.findElement(By.id("acceptq1")).sendKeys(Keys.SPACE);
		
		
		driver.findElement(By.id("continue")).click();
		
		driver.quit();
		
		System.out.println("Completed");
		
		
		
		
		
		
		
		
		
		
		
	}

}
