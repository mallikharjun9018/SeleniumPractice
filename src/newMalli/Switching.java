package newMalli;

import java.awt.RenderingHints.Key;
import java.util.ResourceBundle.Control;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Switching {
   public static void main(String[] args) throws InterruptedException {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\selenuim\\RameshSoft\\Drivers\\chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
	
	driver.findElement(By.name("q")).sendKeys("flipkart", Keys.ENTER);
	Thread.sleep(2000);
	WebElement flipkartLink=driver.findElementByCssSelector(".LC20lb.DKV0Md");
	
	Actions action =new Actions(driver);
	action.contextClick(flipkartLink).sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER).perform();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
