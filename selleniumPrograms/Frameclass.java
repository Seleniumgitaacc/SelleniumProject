package selleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frameclass {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.Chromedrive.driver","D:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteCookieNamed("");
		
		
		driver.get("https://classic.freecrm.com/");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("vrushumore");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Riyansh@123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		//switchTo Frame 
		driver.switchTo().frame("mainpanel");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		driver.quit();
	}

	

}
