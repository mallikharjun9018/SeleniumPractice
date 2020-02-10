package mallikharjuna;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DrpDownSelection {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\selenuim\\RameshSoft\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		WebElement uname= driver.findElement(By.className("_2zrpKA"));
		uname.clear();
		uname.sendKeys("9014141198");
		
		WebElement pword=driver.findElement(By.xpath("//input[@type='password']"));
		               /*   there is a space between A and _. Selenium won't allow compound class name.
		                    So use xpath for the same as mentioned above      */
		pword.clear();
		pword.sendKeys("9014141198");
//		WebElement signIn=driver.findElement(By.xpath("//button[@type='submit']"));
		WebElement signIn=driver.findElement(By.xpath("//div[@class='_2VTdOs _1_qmw3']/following-sibling::span/Login"));
		signIn.submit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
