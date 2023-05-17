package selleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) throws Exception {
       System.setProperty("webdriver.chromedriver.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
       WebDriver driver= new ChromeDriver();
       driver.get("https://www.facebook.com/");
       driver.manage().window().maximize();
       driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
       Thread.sleep(3000);
       
       List<WebElement>birthMonth=driver.findElements(By.xpath("//select[@id='month']/option"));
       System.out.println("Total dropdown values: "+birthMonth);
       birthMonth.get(8).click();
       
	}

}
