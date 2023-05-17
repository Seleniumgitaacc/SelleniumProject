package selleniumPrograms.Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver","D:\\Software\\chromedriver_win32\\chromedriver.exe");
	       WebDriver driver= new ChromeDriver();
	       driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	//driver.manage().timeouts().implicitlyWait(null);
	     driver.get("https://www.facebook.com/");
	     driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vrushu.more@gmail.com");
	     driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Riyansh@123");
	     driver.findElement(By.name("login")).click();
	     //Alert alert=driver.switchTo().alert();
	     //System.out.println(alert.getText());
	     //alert.accept();
	      
	     //WebElement dash= driver.findElement(By.xpath("//span[contains(text(),'Vrushali More')]"));
	  
	}

}
