package seleniumJavaConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebTableHandle {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); // launch chrome

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://classic.freecrm.com/"); // enter URL

		driver.findElement(By.name("username")).sendKeys("batchautomation");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@type='submit']")).click();

		driver.switchTo().frame("mainpanel");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();

		//*[@id='vContactsForm']/table/tbody/tr[4]/td[2]/a
		//*[@id='vContactsForm']/table/tbody/tr[5]/td[2]/a
		//*[@id='vContactsForm']/table/tbody/tr[6]/td[2]/a		
		//*[@id='vContactsForm']/table/tbody/tr[7]/td[2]/a

		//*[@id="vContactsForm"]/table/tbody/tr[24]/td[2]/a


		//Method-1:
//		String before_xpath = "//*[@id='vContactsForm']/table/tbody/tr[";
//		String after_xpath = "]/td[2]/a";
//
//		for(int i=4; i<=24; i++){
//			String name = driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
//			System.out.println(name);
//			if(name.contains("Aakash Anmash")){ //i=9
//
//				//*[@id="vContactsForm"]/table/tbody/tr[9]/td[2]/a
//				driver.findElement(By.xpath("//*[@id='vContactsForm']/table/tbody/tr["+i+"]/td[1]/input")).click();
//			}
//		}

		//Method-2:
		driver.findElement(By.xpath("//a[contains(text(),'Aakash Anmash')]/parent::td//preceding-sibling::td//input[@name='contact_id']")).click();
									 //a[contains(text(),'Aakash Anmash')]/parent::td//preceding-sibling::td//input[@name='contact_id']
		driver.findElement(By.xpath("//a[contains(text(),'Aaa_Queen Elis')]/parent::td//preceding-sibling::td//input[@name='contact_id']")).click();










	}

}