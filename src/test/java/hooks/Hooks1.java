package hooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks1 {

	
	   public  WebDriver driver;

	    @Before
	    public void setUp() {
	   	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\DAYAL\\Documents\\DayalNeranjana\\DAYAL\\Automation\\BDDTestAutomation_Demo\\drivers\\chromedriver.exe");
		 driver = new ChromeDriver();	 
		 driver.manage().window().maximize();	 
		 driver.get("https://www.google.com/");
	    }

	    @After
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	            System.out.println("Browser closed");
	        }
	    }

	    public WebDriver getDriver() {
	        return driver;
	    }
}
