package selleniumPrograms.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver","D:\\Software\\chromedriver_win32\\chromedriver.exe");
	       WebDriver driver= new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://www.rediff.com/");
	         //driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
	        //Select select =new Select(driver.findElement(By.id("month")));
	       //select.selectByVisibleText("feb");
	       driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
	       
	       
	}

}
