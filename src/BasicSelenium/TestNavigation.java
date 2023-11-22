package BasicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNavigation {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\susan\\eclipse-ATCourse\\SeleniumBasic\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://roadninja.co.nz/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://app.roadninja.co.nz/");
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		
		
		
	}

}
