package selleniumPrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ReadPropFile {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {

		Properties prop= new Properties();
		FileInputStream ip=new FileInputStream("C:\\Users\\adamin\\eclipse-workspace\\SelleniumJavaTraning_JanSelf\\src\\selleniumPrograms\\config.properties");
	    prop.load(ip);
	    System.out.println(prop.getProperty("name"));
	    System.out.println(prop.getProperty("age"));
	    
	   String url= prop.getProperty("URL");
	   System.out.println(url);
	   
	   String browsername=prop.getProperty("browser");
	   System.out.println("browser");
	   
	   if(browsername.equals("chrome")) {
		   System.setProperty("webdriver.Chromedrive.driver","D:\\Software\\chromedriver_win32\\chromedriver.exe");
			 driver=new ChromeDriver();
	   }
	   else if(browsername.equals("FF")) {
		   System.setProperty("webdriver.Chromedrive.driver","D:\\Software\\chromedriver_win32\\geckodriver.exe");
			 driver=new FirefoxDriver();
	   }
	   else if(browsername.equals("IE")) {
		   System.setProperty("webdriver.Chromedrive.driver","D:\\Software\\chromedriver_win32\\InternetExplorerDriver.exe");
			 driver=new InternetExplorerDriver();
	   }
	   driver.get(url);
	}

}
