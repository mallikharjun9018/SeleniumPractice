package newMalli;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TotalLinksTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\selenuim\\RameshSoft\\Drivers\\chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.findElementByName("q").sendKeys("Selenium by Ramesh Annapati" , Keys.ENTER);
		
//      Actions actions = new Actions(driver);
//      actions.click().perform();
		driver.findElementByXPath("//h3[contains(text(),'Selenium : Selenium WebDriver')]").click();
		int enablelinks=0;
		int disablelinks=0;
		int totalLinks =0;
		
		List<WebElement> elements = driver.findElements(By.cssSelector("*"));
		for(WebElement ele :elements){
			String links = ele.getTagName();
			if(links.equalsIgnoreCase("a")){
				if(ele.isDisplayed() && ele.isEnabled()){				
//                  ele.click();
					enablelinks++;
		}
				
				else 
				{
					disablelinks++;
		}
	}
}
				System.out.println("working links are : "+enablelinks++);			
				System.out.println("Not working links :" +disablelinks++);
	
	}
}
	
	
	
	


