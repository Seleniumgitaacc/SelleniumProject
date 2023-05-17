import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupWindows {

	public static void main(String[] args) throws Exception {
		//1. alert--JavaScript Pop up-- Alert(accept,dismiss)
		//2. File Upload pop up-- Browse Button (type= file,sendkeys(path)
		//3.Browser window popup- Advertisement pop up (windowHandler API-getWindowhandles())
		
		System.setProperty("webdriver.Chromedrive.driver","D:\\Software\\chromedriver_win32\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.get("http:/www.popuptest.com/goodpopups.html");
       
       driver.findElement(By.xpath("")).click();
       
       Thread.sleep(2000);
       Set<String>handler= driver.getWindowHandles();
       Iterator<String> it=handler.iterator();
       
       String parentWindowId = it.next();
       System.out.println("Parent window id:" + parentWindowId);
       
       String childWindowId= it.next();
       System.out.println("Child window id:" +childWindowId);
       
       driver.close();
       driver.switchTo().window(parentWindowId);
       
       System.out.println("parent window title" +driver.getTitle());
      
	}

}
