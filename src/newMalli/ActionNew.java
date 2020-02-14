package newMalli;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ActionNew {
   public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\selenuim\\RameshSoft\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.co.jp/?gfe_rd=cr&dcr=0&ei=JqNhWsuIGuGdX6mmgdAK");
	driver.manage().window().maximize();
	driver.findElement(By.name("q")).sendKeys("ama");
	Thread.sleep(2000);
	Actions actions = new Actions(driver);
  WebElement amazonIn =  driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div/div[2]/div[2]/ul/li[5]/div/div[2]/div/span"));
	actions.moveToElement(amazonIn).click().build().perform();
	Thread.sleep(2000);
	//driver.findElement(By.partialLinkText("https://www.amazon.in/Books-Login/s?rh=n%3A976389031%2Cp_27%3ALogin")).click(); 
	
	//WebElement login2 = driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div[2]/div/div/div[1]/a/h3"));
	//login2.click();
	
	
	

	
	
	
		
		
		
		
		
		
		
		

	
	
	
	
	
	
	
	
	
	}

}
