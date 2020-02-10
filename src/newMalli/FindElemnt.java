package newMalli;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElemnt {
   public static void main(String[] args) {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\selenuim\\RameshSoft\\Drivers\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://www.amazon.in/");
	   driver.manage().window().maximize();
	   
//	   driver.findElement(By.xpath("//span[text()='Hello. Sign in']")).click();
	   WebElement sign =  driver.findElement(By.xpath("//span[contains(text(),'Hello. Sign in')]"));
	   sign.click();
	   driver.findElement(By.xpath(""));
	   
		
		
	}

}
