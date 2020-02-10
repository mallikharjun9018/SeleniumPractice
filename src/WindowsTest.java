import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import bsh.commands.dir;


public class WindowsTest {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\selenuim\\RameshSoft\\Drivers\\chromedriver.exe");
	RemoteWebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.get("https://www.bing.com");
	driver.findElementByLinkText("MSN").click();
	driver.findElementByLinkText("Office Online").click();
	Thread.sleep(2000);
	driver.findElementByLinkText("Outlook.com").click();
	Thread.sleep(8000);
	String windows=driver.getTitle();
	System.out.println("window Name = " + windows);
	Set<String> openedWindows=driver.getWindowHandles();
	System.out.println("Opened windows are:"+openedWindows.size());
	List<String> l=new ArrayList(openedWindows);
	String officeOnline=l.get(2);
	String firstWindow=l.get(0);
	driver.switchTo().window(officeOnline);
	Thread.sleep(5000);
	driver.close();
	System.out.println(driver.getTitle());
	
	for (String string : l) {
		if (string==l.get(0)) {
			driver.close();;
		}
	}
	}	
	}

