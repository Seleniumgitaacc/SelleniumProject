package selleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindelementsUse {

	public static void main(String[] args) {
		System.setProperty("webdriver.Chromedriver.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.manage().deleteAllCookies();
		driver.findElement(By.id("email")).sendKeys("vrushu.more@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Riyansh@123");
		driver.findElement(By.name("login")).click();
		
		List <WebElement> linkList= driver.findElements(By.tagName("a"));
		System.out.println(linkList.size());
		for(int i=0;i<linkList.size();i++) {
			String linktext=linkList.get(i).getText();
			System.out.println(linktext);
		}
		
	}

}
