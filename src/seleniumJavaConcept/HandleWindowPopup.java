package seleniumJavaConcept;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWindowPopup {

	public static void main(String[] args) throws InterruptedException {
		
		
		//1. alerts -- JavaScript Pop UP-- Alert API (accept, dismiss)
		//2. File Upload pop up -- Browse Button (type = file, sendKeys(path)
		//3. Browser Window Popup - Advertisement pop up (windowHandler API - getWindowHandles() )
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); //launch chrome
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		driver.get("http://www.popuptest.com/goodpopups.html");

		driver.findElement(By.xpath("html/body/table[2]/tbody/tr/td/font/b/a[3]")).click();

		Thread.sleep(2000);

		Set<String> handler = driver.getWindowHandles();

		Iterator<String> it = handler.iterator();

		String parentWindowId = it.next();
		System.out.println("parent window id:"+ parentWindowId);


		String childWindowId = it.next();
		System.out.println("Child window id:"+childWindowId);

		driver.switchTo().window(childWindowId);

		Thread.sleep(2000);

		System.out.println("child window pop up title"+driver.getTitle());

		driver.close();

		driver.switchTo().window(parentWindowId);

		Thread.sleep(2000);

		System.out.println("parent window title"+driver.getTitle());



	}

}