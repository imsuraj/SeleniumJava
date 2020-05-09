package seleniumJavaConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleFileUploadPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://html.com/input-type-file/");

		driver.findElement(By.xpath("//*[@id='fileupload']")).sendKeys("/Users/suraj/git/SeleniumJavaFramework/SeleniumJavaFramework/extentReportsNew.html");
	}

}
