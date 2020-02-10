package mallikharjuna;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.thoughtworks.selenium.webdriven.commands.Close;

class TestNg {
	WebDriver driver;
	static int a=20;
	
	public void openBrowser(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\selenuim\\RameshSoft\\Drivers\\chromedriver.exe");
		a=10;
		System.out.println(this.a);
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}	
	public void close() {
		a=30;
		System.out.println(a);
driver.close();
	}	
public void google() {
	//System.out.println(a);
	driver.findElement(By.name("q")).sendKeys("selenium by ramesh anapati");
}
}
public  class Test{
	public static void main(String[] args) {
		TestNg t=new TestNg();
		t.openBrowser();
		t.close();
		//t.google();
		System.out.println();
		
		
	}
}