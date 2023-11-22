package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestDragandDrop {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\susan\\eclipse-workspace\\Test\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		// to maximize the screen
		driver.manage().window().maximize();
		
		WebElement s = driver.findElement(By.xpath("//a[contains(text(),'SALES')]"));
		WebElement d = driver.findElement(By.xpath("//ol[@id='loan']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(s, d).perform();
		
		Thread.sleep(2000);
		WebElement s1 = driver.findElement(By.xpath("(//a[contains(text(),'5000')])[1]"));
		WebElement d1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		act.dragAndDrop(s1, d1).perform();
		
		
		
	}

}
