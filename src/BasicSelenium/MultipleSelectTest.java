package BasicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\susan\\eclipse-workspace\\Test\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.xpath("//select[@id='cars']"));
		
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
//		for (WebElement i : options) {
//			String text = i.getText();
//			System.out.println(text);
//			s.selectByVisibleText(text);
//		}
		for (int i = 0; i < options.size(); i++) {
			WebElement element2 = options.get(i);
			String text = element2.getText();
			System.out.println(text);
			s.selectByIndex(i);
			
		}
		
		
		
		
	}

}
