package seleniumJavaConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectCalendarByJS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); // launch chrome

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://spicejet.com/"); // enter URL
		
		
		WebElement radioBtn  = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']"));
		radioBtn.click();
		
		WebElement fromDate = driver.findElement(By.id("ctl00_mainContent_txt_Fromdate"));
		WebElement toDate = driver.findElement(By.id("ctl00_mainContent_txt_Todate"));
		String fromDateVal = "30-05-2020";
		
		String toDateVal = "25-06-2020";

		selectDateByJS(driver, fromDate, fromDateVal);
		selectDateByJS(driver, toDate, toDateVal);
		

	}


	public static void selectDateByJS(WebDriver driver, WebElement element, String dateVal){
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');", element);

	}

}
