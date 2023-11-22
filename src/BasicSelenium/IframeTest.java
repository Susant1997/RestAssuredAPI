package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\sasik\\susant\\TestTest\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/frame");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		// driver.switchTo.frame(String id or String name)
		driver.switchTo().frame("firstFr");
		driver.findElement(By.name("fname")).sendKeys("Susant");
		
		
		WebElement f2 = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		driver.switchTo().frame(f2);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("susant.bhandari424@gmail.com");
		
		driver.switchTo().defaultContent(); // This code take you to the window.
		driver.switchTo().frame("firstFr");
		driver.findElement(By.name("lname")).sendKeys("Bhandari");
		
	}

}
