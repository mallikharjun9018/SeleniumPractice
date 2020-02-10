package newMalli;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class KeyboardTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\selenuim\\RameshSoft\\Drivers\\chromedriver.exe");
		RemoteWebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.findElementByName("q").sendKeys("selenium");
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		WebElement seleniumText= driver.findElementByXPath("//*[@id='tsf']/div[2]/div/div[2]/div[2]/ul/li[2]/div/div[2]/div/span");
		actions.moveToElement(seleniumText).click().build().perform();
		

	}

}
