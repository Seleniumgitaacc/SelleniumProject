package selleniumPrograms.Locators;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorClassDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chromdriver.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.linkText("Fashion")).click();
		
		int container = driver.findElements(By.className("sl-sobe-carousel-sub-card-image")).size();
		System.out.println(container);
		driver.findElement(By.linkText("Today's Deals")).click();
	     int link=driver.findElements(By.tagName("img")).size();
	     System.out.println(link);
	    
	}

}
