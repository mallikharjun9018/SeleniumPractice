package newMalli;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AutoSuggestionsTest {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\selenuim\\RameshSoft\\Drivers\\chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		String pageTitle =driver.getTitle();
		System.out.println("page title is :" +pageTitle);
		
		//WebElement search=driver.findElementByXPath("//*[@id='twotabsearchtextbox']");
		//search.sendKeys("samsung");
		driver.findElementByName("q").sendKeys("selenium");
		
		driver.findElementByXPath("//*[@class='erkvQe']/li[3]/div/div[2]]").click();
		
		//Actions actions = new Actions(driver);
		//laptop.click();
		//actions.moveToElement(laptop).click().perform();
		
		
		
		//actions.clickAndHold().perform();
		//actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).click().perform();

	}

	
}
