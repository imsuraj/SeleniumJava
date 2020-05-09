package seleniumJavaConcept;

//import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopupHandle {

	public static void main(String[] args) throws Exception {
		//BasicConfigurator.configure();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();;
		
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		String text = alert.getText();
		
		if (text.equals("Please enter a valid user name")) {
			System.out.println("Corect alert message");
		}
		else {
			System.out.println("Wrong alert message");
		}
		Thread.sleep(5000);
		alert.accept();// clicks on ok button
		
		//alert.dismiss(); // click on cancel button if available
		
		
		driver.findElement(By.id("login1")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();;
		
		Alert alert1 = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		String text1 = alert1.getText();
		
		if (text1.equals("Please enter your password")) {
			System.out.println("Corect alert message");
		}
		else {
			System.out.println("Wrong alert message");
		}

		Thread.sleep(5000);
		alert1.accept();
		driver.findElement(By.id("login1")).clear();
		
		
		driver.findElement(By.id("password")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();;
		
		Alert alert2 = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		String text2 = alert2.getText();
		
		if (text2.equals("Please enter a valid user name")) {
			System.out.println("Corect alert message");
		}
		else {
			System.out.println("Wrong alert message");
		}
		
		Thread.sleep(5000);
		alert2.accept();
		
		System.out.println("Completed");
		
		driver.quit();
		
		
	}
}
