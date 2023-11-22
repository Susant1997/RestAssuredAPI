package BasicSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestDouble {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\susan\\eclipse-workspace\\Test\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		// to maximize the screen
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
//		WebElement double1 = driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To')]"));
		
		Actions act = new Actions(driver);
//		act.doubleClick(double1).perform();
		
		WebElement right = driver.findElement(By.xpath("//span[contains(text(),'right')]"));
		act.contextClick(right).perform();
		
		Thread.sleep(2000);
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
	}

}
