package BasicSelenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotTest {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\susan\\eclipse-ATCourse\\SeleniumBasic\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.roadninja.co.nz/");
		
		// maximize the screen of the page
		driver.manage().window().maximize();
		
		// to get the title of the page
		String title = driver.getTitle();
		System.out.println(title);
		
		// to get the current url of the page
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		// to close the browser
//		driver.quit();
		
		// locators used like Id, name and Class
				WebElement element = driver.findElement(By.name("username"));
				element.sendKeys("susant+company@roadninja.co.nz");
				
				WebElement element1 = driver.findElement(By.name("password"));
				element1.sendKeys("December@1997");
				
				WebElement element2 = driver.findElement(By.className("MuiButton-label"));
				element2.click();
				
				Thread.sleep(2000);
				
				TakesScreenshot src = (TakesScreenshot)driver;
				File f = src.getScreenshotAs(OutputType.FILE);
				File d = new File("C:\\Users\\susan\\OneDrive\\Pictures\\Saved Pictures\\susant.jpg");
				FileUtils.copyFile(f, d);
				
				driver.quit();
	
	}

}
	


