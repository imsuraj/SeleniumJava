package seleniumJavaConcept;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootstrapDropboxHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); // launch chrome

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2"); // enter URL


		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();


		List<WebElement> list = driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//li//a//label"));
		List<WebElement> list1 = driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//li"));

		System.out.println(list.size());// give the size of element on list.



		//		//Seleciing all the checkboxes and options
		//		for (int i = 0; i < list.size(); i++) {
		//
		//			System.out.println(list.get(i).getText());
		//
		//			list.get(i).click();
		//
		//
		//		}

		//		for (int i = 0; i < list1.size(); i++) {
		//			System.out.println(list1.get(i).getText());
		//			if (!"active".equals(list1.get(i).getAttribute("class"))) {
		//				list1.get(i).click();
		//			}
		//		}


		//		List<WebElement> list1 = driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//li"));
		//
//				for (WebElement webElement : list1) {
//					System.out.println(webElement.getText());
//					if (!"active".equals(webElement.getAttribute("class"))) {
//						webElement.click();
//					}
//				}




//		for (WebElement webElement : list) {
//			try {
//				
//				if (webElement.isSelected()) {
//					System.out.println("Checkbox: " + webElement + "is already selected");
//				}else {
//					webElement.click();
//				}
//				
//			} catch (Exception e) {
//				System.out.println("Unable to select the checkbox: " + webElement);
//				// TODO: handle exception
//			}
//
//		}


	

	//selecting Angular option

//			for (int i = 0; i < list.size(); i++) {
//				System.out.println(list.get(i).getText());
//				if (list.get(i).getText().contains("Angular")) {
//					list.get(i).click();
//					break;
//				}
//				
//				
//			}




}
	
}




