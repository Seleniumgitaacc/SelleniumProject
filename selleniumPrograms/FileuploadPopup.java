package selleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileuploadPopup {

	public static void main(String[] args) {

		System.setProperty("webdriver.Chromedrive.driver","D:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.get("https://html.com/input-type-file/#All_attributes_of_input");
		drive.findElement(By.xpath("//input[@name='fileupload']")).sendKeys("C:\\Users\\adamin\\OneDrive\\Desktop\\js notes.docx");
		drive.findElement(By.xpath("//input[@value='submit']")).click();
	
	}
}
