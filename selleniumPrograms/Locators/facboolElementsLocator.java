package selleniumPrograms.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facboolElementsLocator {

	public static void main(String[] args) throws Exception {
       System.setProperty("Webdriver.chrome.driver", "D:\\\\Software\\\\chromedriver_win32\\\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
      // String url="https://www.facebook.com/login/";
       driver.get("https://www.facebook.com/login/");
       driver.navigate().refresh();
      // driver.navigate().to("https://www.amazon.in/");
      // driver.navigate().back();
       
       WebElement str=driver.findElement(By.name("email"));
        str.sendKeys("vrushu.more@gmail.com");
        WebElement str1=driver.findElement(By.name("pass"));
        str1.sendKeys("Riyansh@123");
        
        WebElement str2=driver.findElement(By.id("loginbutton"));
        str2.click();
        Thread.sleep(50000);
        driver.close();
	}

}
