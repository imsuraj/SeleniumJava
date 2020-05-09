package seleniumJavaConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarSelectTest {

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


		driver.findElement(By.xpath("//a[contains(text(),'Calendar')]")).click();;

		String date = "31-September-2017";
		String dateArr[] = date.split("-");

		String day = dateArr[0];
		String month = dateArr[1];
		String year = dateArr[2];


		Select select = new Select(driver.findElement(By.name("slctMonth")));
		select.selectByVisibleText(month);

		Select select1 = new Select(driver.findElement(By.name("slctYear")));
		select1.selectByVisibleText(year);

		boolean flag = false;

		//*[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[6]
		//*[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[7]
		//*[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[7]/td[1] 


		String beforeXpath = "//*[@id=\"crmcalendar\"]/table/tbody/tr[2]/td/table/tbody/tr[";
		String afterXpath = "]/td[";

		final int totalWeekDays = 7;


		for (int rowNum = 2; rowNum < 7; rowNum++) {
			for (int colNum = 1; colNum < totalWeekDays; colNum++) {
				String dayValue = driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+"]")).getText();

				System.out.println(dayValue);

				if (dayValue.equals(day)) {
					driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+"]")).click();
					flag = true;
					break;
				}
				if (flag) {
					break;
				}

			}

		}


		System.out.println("Test Completed");

	}






}


