package pages;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.OpenChromeDriver;

public class LoginPage extends OpenChromeDriver {
  
	
	public static void optionbrowser() {
		OpenChromeDriver.opendriver();
	}
	
	public static void method_enterUserName(String userName) {
		
	WebElement search = driver.findElement(By.xpath("//*[@title='Search']"));
	
	search.sendKeys(userName);
	
	}
	
	
	public static void method_enterUserName_isDisplayed() {
		
	WebElement search = driver.findElement(By.xpath("//*[@title='Search']"));	
	search.isDisplayed();
	search.clear();
	search.sendKeys("Clear");
	
	
	String txt = search.getText();
	assertEquals("string123", txt);
	
	}
	
	
	public static void method_ClickOkButton() {
		
	//WebElement search = driver.findElement(By.xpath("//*[@title='Search']"));
	
	//search.isDisplayed();
	}
	
	
	public static void method_enterUserName_Fail(String userName) {
		
		WebElement search = driver.findElement(By.xpath("//*[@title='Search11']"));
		search.sendKeys(userName);

	}
	public static void method_ClickOkButton_Clear() {
		
		WebElement search = driver.findElement(By.xpath("//*[@title='Search11']"));
		search.clear();
		search.sendKeys("Clear");
		
	}
	
	public static void method_VerifyPageTitle() {
		

		
	}
}


