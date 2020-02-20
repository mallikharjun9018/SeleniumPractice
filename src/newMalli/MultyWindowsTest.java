package newMalli;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MultyWindowsTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\selenuim\\RameshSoft\\Drivers\\chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.bing.com");
		
		driver.findElementById("dots_overflow_menu_container").click();
		WebElement office=driver.findElementByXPath("//li[@id='office']/a");
		WebElement msOffice=driver.findElementByXPath("//li[@id='outlook']/a/div[2]");
		
		Actions actions = new Actions(driver);
		actions.moveToElement(office).click(msOffice).perform();	
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		WebElement oneDrive=driver.findElementByXPath("//li[@id='onedrive']/a/div[2]");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		actions.click(oneDrive).perform();
		
		String currentWindow=driver.getTitle();
		System.out.println("Current Window: " +currentWindow);
		Set<String> windows = driver.getWindowHandles();
		
		List<String> l=new ArrayList<String>(windows);
		
		String firstWindow=l.get(0);
		String secondWindow=l.get(1);
		String thirdWindow=l.get(2);
		
		System.out.println("First window :" + firstWindow);
		System.out.println("First window :" + secondWindow);
		System.out.println("First window :" + thirdWindow);
			
		driver.switchTo().window(secondWindow);
		String switchedWindow=driver.getTitle();
		System.out.println("Switched window :" +switchedWindow);
		
		driver.findElementById("i0116").sendKeys("manode", Keys.ENTER);
		
		
		
		
		//driver.switchTo().window(oneDriveWindow);
		//
		//String oneDriveW=driver.getTitle();
		//String w2=driver.getWindowHandle();
		//System.out.println("Current Window: " + oneDriveW);
		
		
		/*for(String w :windows){
			w.equalsIgnoreCase(currentWindow);
			driver.switchTo().window(w);
		}
		
		
		String w2=driver.getWindowHandle();
		System.out.println("Current Window: " + w2);
		
		*/
		
		
		
		
		
		
			
	}

}
