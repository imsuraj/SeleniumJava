package seleniumJavaConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementVisibilityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); // launch chrome

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://register.freecrm.com/register/"); // enter URL
		
		//1. isDisplayed() method: applicanle for all the elements
		boolean b1 = driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed(); //for submit button
		System.out.println(b1); //true
		
		//2. isEnabled() method:
		boolean b2 = driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
		System.out.println(b2);//false
//		
//		//select I Agree checkbox:
		driver.findElement(By.name("terms")).click();  //--submit button is enabled now
//		boolean b3 = driver.findElement(By.id("submitButton")).isEnabled();
//		System.out.println(b3);//true
//		
//		
		//3. isSelected() method: only applicable for checkbox, dropdown, radiobutton
		boolean b4 = driver.findElement(By.id("terms")).isSelected();
		System.out.println(b4);//true
//		
//		
		//de-select the checkbox:
		driver.findElement(By.name("terms")).click();
		boolean b5 = driver.findElement(By.id("terms")).isSelected();
		System.out.println(b5);//false
//		
		
		
		driver.quit();
		
		
		
		
	}

}