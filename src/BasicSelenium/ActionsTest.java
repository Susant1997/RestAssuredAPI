package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionsTest{
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\susan\\eclipse-workspace\\Test\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.roadninja.co.nz/");
		
		// to maximize the screen
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("susant+company@roadninja.co.nz");
		
		
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("December@1997");
		
		
		driver.findElement(By.xpath("//span[@class='MuiButton-label'][1]")).click();
		
		
		Thread.sleep(5000);
		
		
		WebElement element3 = driver.findElement(By.xpath("(//span[@class='MuiTouchRipple-root'])[1]"));
		Actions act = new Actions(driver);
		act.moveToElement(element3).perform();
		
		Thread.sleep(2000);
		
		// Landing page footer sign up 
//		WebElement element = driver.findElement(By.xpath("//a[@class='Footer-Link Footer-Link_second Button_sign_up']"));
//		Actions act = new Actions(driver);
//		act.moveToElement(element).perform();
		
		driver.findElement(By.xpath("//a[@href='/drivers']")).click();
		
		
	}

}
