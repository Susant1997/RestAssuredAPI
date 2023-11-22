package BasicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;
import org.openqa.selenium.support.ui.Select;

public class TestSelect {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\susan\\eclipse-workspace\\Test\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html#google_vignette");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// Select by Index
		WebElement element = driver.findElement(By.xpath("//select[@id='Skills']"));
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
//		for (WebElement x : options) {
//			String text = x.getText();
//			System.out.println(text);
			
			for (int i = 1; i < options.size(); i++) {
				WebElement element2 = options.get(i);
				String text2 = element2.getText();
				System.out.println(text2);
			}
		
			
	
		
		
		s.selectByIndex(2);
		
		
		// Select by Value
		WebElement element1 = driver.findElement(By.xpath("//select[@id='yearbox']"));
		Select s1 = new Select(element1);
		s1.selectByValue("2006");
		
		//Select by Visible Text
		WebElement element2 = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select s2 = new Select(element2);
		s2.selectByVisibleText("January");
	}
	}


