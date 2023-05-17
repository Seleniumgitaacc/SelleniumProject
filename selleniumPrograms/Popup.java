package selleniumPrograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chromedriver.driver","D:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		driver.findElement(By.xpath("//button[@name='alertbox']")).click();
		Alert alert=driver.switchTo().alert();
		String s1=alert.getText();
		if(s1.equals("I am an alert box!"))
		{
			System.out.println("String is correct");
			
		}else
			System.out.println("Incorrect string");
		alert.accept();
		Thread.sleep(30000);
		driver.findElement(By.xpath("//button[@name='confirmalertbox']")).click();
		String s=alert.getText();
		if(s.equals("I am an alert box!"))
		{
			System.out.println("String is correct");
			
		}else
			System.out.println("Incorrect string");
		//alert.accept();
		Thread.sleep(3000);
		alert.dismiss();
		driver.findElement(By.xpath("//button[@name='promptalertbox1234']")).click();
		//driver.findElement(By.xpath("//button[@name='promptalertbox1234']")).sendKeys("Yes");
		System.out.println(alert.getText());
		Thread.sleep(3000);
		alert.accept();

		driver.quit();
	}

}
