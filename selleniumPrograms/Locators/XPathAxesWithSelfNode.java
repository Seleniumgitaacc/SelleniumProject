package selleniumPrograms.Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author adamin
 *
 */
public class XPathAxesWithSelfNode {

	public static void main(String[] args) {
       System.setProperty("webdriver.chromedriver.driver","D:\\Software\\chromedriver_win32\\chromedriver.exe");
       WebDriver driver= new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://money.rediff.com/gainers");
       
       //Using child node get text
       String text= driver.findElement(By.xpath("//a[contains(text(),'Amraworld Agrico Ltd')]//self::a")).getText();
       System.out.println(text);
       
       //Using parent get text locate 
       text =driver.findElement(By.xpath(" //a[contains(text(),'Amraworld Agrico Ltd')]/parent::td")).getText();
       System.out.println(text);
       
       //Child Select all children of the current node(one or many)
       List<WebElement>childs=driver.findElements(By.xpath("//a[contains(text(),'Chandni Machines')]/ancestor::tr/child::td"));
       System.out.println(childs.size());//5 columan size
       
       //ancestor-Select all ancestor parent and all gramd parent 
       text= driver.findElement(By.xpath("//a[contains(text(),'Chandni Machines')]/ancestor::tr")).getText();
       System.out.println(text);
       
       //Descendant-select all descendants (child and grand child etc.
       List<WebElement> descendants=driver.findElements(By.xpath("//a[contains(text(),'Chandni Machines')]/ancestor::tr/descendant::*"));
       System.out.println(descendants.size());
       
       //Following select everything in the document after the closing tag of the current node
       List<WebElement> followingnodes=driver.findElements(By.xpath("//a[contains(text(),'Chandni Machines')]/ancestor::tr/following::tr"));
        System.out.println(followingnodes.size());
        
        //followingsibling
        List<WebElement> followingsibling= driver.findElements(By.xpath("//a[contains(text(),'Chandni Machines')]/ancestor::tr/following-sibling::tr"));
         System.out.println(followingsibling.size());
         
         //Preceding
        
	}

}
