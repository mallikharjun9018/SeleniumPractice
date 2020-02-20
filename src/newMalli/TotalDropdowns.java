package newMalli;

import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TotalDropdowns {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\selenuim\\RameshSoft\\Drivers\\chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
		List<WebElement> elements = driver.findElementsByXPath("//*");
		int count=0;
		int frame=0;
		
/*		ListIterator ltr = elements.listIterator();
        while (ltr.hasNext())
		{
		WebElement ele = (WebElement)ltr.next();
		String tagName = ele.getTagName();
		if(tagName.equalsIgnoreCase("select"))
		   count++;                                          */
		
		for(WebElement ele :elements)
		{
			if(ele.getTagName().equalsIgnoreCase("select"))
		        count++;
			else
				if(ele.getTagName().equalsIgnoreCase("a"))
					frame++;
	}
		System.out.println("No.of drodowns are : " +count);
		System.out.println("no.of links  are : " +frame);
	}
	
}
