package selleniumPrograms.Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatordemo1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
        
		System.setProperty("webdriver.chromedriver.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		/*driver.get("https://www.facebook.com/");
		
		//id and name locator
		WebElement searchbox=driver.findElement(By.id("email"));
		searchbox.sendKeys("vrushu.more@gmail.com");
		driver.findElement(By.name("login")).click();*/
		//add new one website
		driver.get("https://www.amazon.in/");
		Thread.sleep(30000);
		driver.findElement(By.linkText("Customer Service")).click();
		driver.findElement(By.linkText("Best Sellers")).click();
		Thread.sleep(30000);
		driver.findElement(By.partialLinkText("Service")).click();
		
	}
	}
	