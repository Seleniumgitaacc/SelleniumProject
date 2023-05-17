package selleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaExecuterhighlite {

	public static void main(String[] args) {

		System.setProperty("webdriver.Chromedrive.driver","D:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteCookieNamed("");
		
		
		driver.get("https://classic.freecrm.com/");
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("vrushumore");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Riyansh@123");
		//driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		WebElement loginbtn=driver.findElement(By.xpath("//input[@value='Login']"));
		flash(loginbtn,driver);//highlight the element
	}

	private static void flash(WebElement element, WebDriver driver) {

		JavascriptExecutor js=((JavascriptExecutor)driver);
	    String bgcolor=element.getCssValue("backgroundcolor");
	    for(int i=0;i<100;i++) {
	    	changeColor("rgb(0,200,0)", element,driver);
	        changeColor(bgcolor, element,driver);
	    }
		
	}

	private static void changeColor(String string, WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

}
