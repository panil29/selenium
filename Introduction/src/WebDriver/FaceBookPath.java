package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookPath {
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver","F:\\softwares\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://facebook.com");
	/*driver.findElement(By.xpath("//*[@name='email']")).sendKeys("pavuluru");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456");
	driver.findElement(By.xpath("//button[@name='login']")).click();*/
	driver.findElement(By.cssSelector("input[name='email']")).sendKeys("login");
	driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("03299697");
	driver.findElement(By.cssSelector("button[name='login']")).click();
	}
}
