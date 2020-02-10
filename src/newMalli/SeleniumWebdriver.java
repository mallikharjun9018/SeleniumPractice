package newMalli;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumWebdriver {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\selenuim\\RameshSoft\\Drivers\\chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	driver.get("https://droom.in/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	String pageTitle = driver.getTitle();
	System.out.println("current page name is : " +pageTitle);
	String URL = driver.getCurrentUrl();
	System.out.println("current page Url is : " +URL);
	String window = driver.getWindowHandle();
	System.out.println("CURRENT WINDOW NAME IS : " +window);
	Set<String> windows = driver.getWindowHandles();
	System.out.println("NO.OF WINDOWS ARE : " +windows.size());
		
		
		
	}

}
