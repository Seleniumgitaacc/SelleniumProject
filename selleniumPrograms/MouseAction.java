package selleniumPrograms;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {
	public static void main(String[] args) throws Exception {
      System.setProperty("webdriver.Chromedriver.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.spicejet.com/");
     Thread.sleep(2000);
      Actions action=new Actions(driver);
      action.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Add-ons')]"))).build().perform();
	  driver.findElement(By.xpath("//div[contains(text(),'International Connection Baggage')]")).click();
      Thread.sleep(5000);
	  driver.quit();
	}
}
