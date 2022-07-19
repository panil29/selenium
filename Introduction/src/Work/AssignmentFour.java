package Work;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentFour {
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","F:\\softwares\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com");
	driver.findElement(By.linkText("Multiple Windows")).click();
	driver.findElement(By.linkText("Click Here")).click();
	Set<String> windows=driver.getWindowHandles();
	Iterator<String> it=windows.iterator();
	String parentID=it.next();
	String childId=it.next();
	driver.switchTo().window(childId);
	System.out.println(driver.findElement(By.cssSelector(".example")).getText());
    //System.out.println(driver.findElement(By.xpath("//div[@class='example]/h3")).getText());
	driver.switchTo().window(parentID);
	System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());	
}
}
