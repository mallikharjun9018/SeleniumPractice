package com.malli.practice;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TotalLinksTest {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\selenuim\\RameshSoft\\Drivers\\chromedriver.exe");
	RemoteWebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.google.com");
	Actions actions=new Actions(driver);
	WebElement searchBox= driver.findElementByName("q");
	searchBox.sendKeys("selenium by ramesh anapati");
	searchBox.submit();
	driver.findElementByClassName("LC20lb").click();
//	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//	actions.contextClick(link).sendKeys(Keys.ARROW_DOWN).perform();
	List<WebElement> allLinks = driver.findElementsByXPath("//*");
	int count=0;
	
	for (WebElement allElement : allLinks) {	
		if(allElement.getTagName().equalsIgnoreCase("a")){			
//			System.out.println("it is a link");
			count++;
	}
	}
		System.out.println("total links are:" +count);
		System.out.println("Total elements are:"+allLinks.size());
		
		
}
}
