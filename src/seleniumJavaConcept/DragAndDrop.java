package seleniumJavaConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete all the cookies

		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


		driver.get("http://jqueryui.com/droppable/");

		driver.switchTo().frame(0);//switch to frame if its present

		Actions action = new Actions(driver);

//		action.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']")))
//		.moveToElement(driver.findElement(By.xpath("//*[@id='droppable']")))
//		.release()
//		.build()
//		.perform();
		
		
		
		action.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']"))).moveToElement(driver.findElement(By.xpath("//*[@id='droppable']")))
		.release()
		.build()
		.perform();

		driver.close();
		System.out.println("Test Completed");
		
	}

}
