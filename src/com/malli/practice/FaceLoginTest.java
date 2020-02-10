package com.malli.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class FaceLoginTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\selenuim\\RameshSoft\\Drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.manage().window().maximize();
driver.get("https://www.facebook.com");

WebElement userName=driver.findElement(By.id("email"));
userName.clear();
userName.sendKeys("8341467010");
WebElement password=driver.findElement(By.name("pass"));
password.clear();
password.sendKeys("8341467010");
WebElement signIn=driver.findElement(By.id("u_0_2"));
signIn.click();
WebElement downArrow=driver.findElement(By.id("userNavigationLabel"));
downArrow.click();
Select dropDown=new Select(driver.findElement(By.id("userNavigationLabel")));
dropDown.selectByIndex(9);
}
}

