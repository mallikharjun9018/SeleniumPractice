package mallikharjuna;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectttt {
   public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\selenuim\\RameshSoft\\Drivers\\chromedriver.exe");
	
	RemoteWebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	WebElement bdate = driver.findElementByName("birthday_day");
//	bdate.click();
/*	                                             OR                                                              
	driver.findElementById("day").click();                         */
	String tagName=bdate.getTagName();
	if(tagName.equalsIgnoreCase("select")){
		Select select=new Select(bdate);
		select.selectByIndex(4);
		select.selectByValue("4");
//		bdate.click();
		WebElement firstele=select.getFirstSelectedOption();
		String textele=firstele.getText();
		System.out.println("TEXT OF THE 1ST SELECTED ELE IS : " + textele);
		boolean dd=select.isMultiple();
		if(dd){
			System.out.println("MULTI SELECT");
		}
			else{
				System.out.println("Single Select");
			}
		List<WebElement> dds=select.getOptions();
		System.out.println("no of elements are : " + dds.size());
	}
	else{
		WebElement ele=driver.findElementByXPath("//*[@id='day']/option[16]");
		ele.click();
		
		
	
		
	}
		
 }
}