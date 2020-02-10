package com.malli.practice;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Gmail {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\selenuim\\RameshSoft\\Drivers\\chromedriver.exe");
		RemoteWebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.gmail.com");
		WebElement userName=driver.findElementByXPath("//input[@id='identifierId'][@name='identifier'][@type='email']");
		userName.clear();
		userName.sendKeys("a1.pervacio");
		WebElement nextButton=driver.findElementByXPath(("//div[@id='identifierNext']"));
		nextButton.click();
		WebElement password=driver.findElementByName("password");
		password.clear();
		password.sendKeys("perv@cio123");
		WebElement signIn=driver.findElementByXPath("//div[@role='button'][@id='passwordNext']");
		signIn.click();
		Thread.sleep(8000);
		WebElement select=driver.findElementByXPath("//a[@class='gb_b gb_hb gb_R'][@role='button']");
		select.click();
		WebElement signOut=driver.findElementByXPath("//a[@class='gb_Aa gb_Ag gb_Ig gb_ff gb_Tb']");
		signOut.click();
		

	}
	}