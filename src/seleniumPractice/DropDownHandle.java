package seleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandle {
	 static WebDriver driver;

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}

	@Test(enabled = false)

	//part 1
	public void dropDown() {

		WebElement month = driver.findElement(By.id("month"));
		WebElement day = driver.findElement(By.id("day"));
		WebElement year  = driver.findElement(By.id("year"));


		///Bad Practice

		//				Select select = new Select(day);
		//				select.selectByVisibleText("11");
		//				
		//				Select select1 = new Select(month);
		//				select1.selectByVisibleText("Jan");
		//				
		//				Select select2 = new Select(year);
		//				select2.selectByVisibleText("1991");


		//Ok practice
		//				clickOn(driver, month, 10);
		//				selectValue(month, "Feb");
		//				
		//				clickOn(driver, day, 10);
		//				selectValue(day, "20");
		//				
		//				clickOn(driver, year, 10);
		//				selectValue(year, "1944");


		//smart practice

		String dob = "10-Jan-1992";
		String dobArray[] = dob.split("-");

		selectValue(day, dobArray[0]);

		selectValue(month, dobArray[1]);

		selectValue(year, dobArray[2]);



	}


	//part 2

	@Test(enabled = false)
	public void selectByIndex() {

		WebElement month = driver.findElement(By.id("month"));
		WebElement day = driver.findElement(By.id("day"));
		WebElement year  = driver.findElement(By.id("year"));

		Select select = new Select(day);
		select.selectByIndex(10);

		System.out.println(select.isMultiple());

		List<WebElement> listDays = select.getOptions();
		System.out.println(listDays.size());

		int totalDays = listDays.size() - 1;

		System.out.println("Total days "+totalDays);

		for (int i = 0; i < listDays.size(); i++) {
			String dayVal = listDays.get(i).getText();
			System.out.println(dayVal);

			if (dayVal.equals("15")) {
				listDays.get(i).click();
				break;
			}
		}



	}


	//Part3
	@Test
	public void handleDropDownPartIII() {

		String month_xpath = "//select[@id='month']//option";
		String day_xpath = "//select[@id='day']//option";
		String year_xpath = "//select[@id='year']//option";


		selectDropDownByValue(month_xpath, "Jun");
		selectDropDownByValue(day_xpath, "10");
		selectDropDownByValue(year_xpath, "1988");



	}



	public static void selectDropDownByValue(String xpathValue, String value) {

		List<WebElement> monthList = driver.findElements(By.xpath(xpathValue));
		System.out.println(monthList.size());
		

		for (int i = 0; i < monthList.size(); i++) {
			String monthVal = monthList.get(i).getText();
			System.out.println(monthVal);
			if (monthVal.equals(value)) {
				monthList.get(i).click();
				break;
			}
		}


	}


	public static void selectValue(WebElement element, String value) {

		Select select = new Select(element);
		select.selectByVisibleText(value);

	}

	public static void clickOn(WebDriver driver, WebElement locator, int timeout) {
		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();


	}

	@AfterMethod
	public void tearDown(){
		//driver.quit();
	}
}
