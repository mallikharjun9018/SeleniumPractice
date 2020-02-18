package newMalli;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ADPlinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\selenuim\\RameshSoft\\Drivers\\chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.adp.com");
		int totalframes=0;
		
		List<WebElement> elements = driver.findElements(By.cssSelector("*"));
		System.out.println("totel elements: "+elements.size());
		
		for(WebElement webelements :elements){
			String tagname = webelements.getTagName();
			if(tagname.equalsIgnoreCase("iframe")){
				totalframes++;
				
			}
		}
		System.out.println("total frames: "+totalframes);
		
		
	}
	
}
