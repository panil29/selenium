package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {
public static void main(String[] args)
{   
	System.setProperty("webdriver.chrome.driver","F:\\softwares\\chromedriver.exe");
	WebDriver a=new ChromeDriver();
	a.get("http://login.salesforce.com");
	a.findElement(By.cssSelector("input[id='username']")).sendKeys("anil");
	a.findElement(By.cssSelector("input[type='password']")).sendKeys("03299697");
	a.findElement(By.xpath("//input[@id='Login']")).click();
    a.close();
}
}
