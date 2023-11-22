package BasicSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;

public class AlertTest {
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\susan\\eclipse-workspace\\Test\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/alert");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Simple Alert Example
//		WebElement element = driver.findElement(By.xpath("//button[contains(text(),'Simple Alert')]"));
//		element.click();
//		Thread.sleep(2000);
//		Alert a = driver.switchTo().alert();
//		String text = a.getText();
//		System.out.println(text);
//		a.accept(); // accept = Ok 	
////		a.dismiss(); // dismiss = cancle
		
		// Confirm Alert Example
//		WebElement element1 = driver.findElement(By.xpath("//button[contains(text(),'Confirm Alert')]"));
//		element1.click();
//		Thread.sleep(2000);
//		Alert a1 = driver.switchTo().alert();
////		a1.accept();
//		a1.dismiss();
		
		// Prompt Alert Example
		WebElement element2 = driver.findElement(By.xpath("//button[contains(text(),'Prompt Alert')]"));
		element2.click();
		Thread.sleep(2000);
		Alert a2 = driver.switchTo().alert();
//		a2.sendKeys("Susant Bhandari");
		
		// PopUp can handle using Robot class without using Alert
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_S);
		
		r.keyPress(KeyEvent.VK_U);
		r.keyRelease(KeyEvent.VK_U);
		
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_S);
		
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		
		r.keyPress(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_N);
		
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_SHIFT);
		
		String text = a2.getText();
		System.out.println(text);
		Thread.sleep(2000);
		a2.accept();
		driver.quit();
	}
		
		
	}


