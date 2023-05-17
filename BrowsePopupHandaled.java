import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowsePopupHandaled {

	public static void main(String[] args) {
     
		System.setProperty("webdriver.Chromedriver.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://html.com/input-type-file/");
		
		driver.findElement(By.xpath("//*[@name='fileupload']")).sendKeys("C:\\Users\\adamin\\OneDrive\\Desktop\\js notes");
	 
	}

}
