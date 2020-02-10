package com.malli.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.print.attribute.standard.MediaSize.Other;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

import com.google.common.collect.Iterators;

public class NaukriTest
{
	
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\selenuim\\RameshSoft\\Drivers\\chromedriver.exe");
	RemoteWebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.naukri.com/nlogin/login");
	Thread.sleep(2000);
	driver.findElementByLinkText("Employer Zone").click();
	Set<String> openedWindows = driver.getWindowHandles();
	List<String> list = new ArrayList<String>(openedWindows);
	driver.switchTo().window(list.get(1));
	Thread.sleep(2000);
		driver.findElementByLinkText("Report a problem").click();
		Thread.sleep(2000);
		Set<String> openedWindws = driver.getWindowHandles();
		Thread.sleep(3000);
		System.out.println(openedWindws.size());
		Set<String> totalWindows = driver.getWindowHandles();
		List<String> listwo = new ArrayList<String>(totalWindows);
		driver.switchTo().window(listwo.get(2));
		Thread.sleep(2000);
		//driver.findElementByClassName("ml20").click();		
		driver.findElementByName("strName").sendKeys("Manoj");
		driver.findElementByName("strEmail").sendKeys("a1.manjreddy@gmail.com");
		driver.findElementByName("strMobile").sendKeys("8341467010");
//			WebElement area = driver.findElementByTagName("select");
//			area.click();
//			Actions actions = new Actions(driver);
//			actions.keyDown(Keys.ARROW_DOWN).click().perform();
	   WebElement conCern= driver.findElementByClassName("textbox");
	   Select select=new Select(conCern);
	   select.selectByValue("Unable to refresh jobs");
	   driver.findElementById("strDetails").sendKeys("REFRESH BUTTON NOT WORKING");
	   driver.findElementByClassName("recaptcha-checkbox-checkmark").click();
	   
	   
		
		
		
		
		
		
		
			
}

		
	}		
		
		


