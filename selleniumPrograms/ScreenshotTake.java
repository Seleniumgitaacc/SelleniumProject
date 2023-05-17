package selleniumPrograms;

import java.io.File;
//import org.apache.commons.io.FilesUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotTake {

	public static void main(String[] args) {
       
		System.setProperty("webdriver.Chromedriver.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		//take Screenshot store as file folder
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//copy screenshot to desire location in copyfile method
		//FilesUtils.copyFiles(src,new File("Users\\adamin\\eclipse-workspace\\SelleniumJavaTraning_JanSelf\\src\\selleniumPrograms\\facebook.png"));
	}

}
