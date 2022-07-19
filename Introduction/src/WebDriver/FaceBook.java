package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
	public static void main(String[] args)  
	{
		System.setProperty("webdriver.chrome.driver", "F:\\softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//System.out.println("driver.getPageSource()");
		/*driver.findElement(By.id("email")).sendKeys("This is my first code");
		driver.findElement(By.name("pass")).sendKeys("123456");
		driver.findElement(By.linkText("Forgot Password?")).click();*/
		//driver.findElement(By.className("inputtext")).sendKeys("world");
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys("pavuluru");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("123456");
	driver.findElement(By.xpath("//a[text()='Forgot Password?']")).click();
		

		driver.close();
	}
}
