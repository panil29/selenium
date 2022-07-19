package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Red{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","F:\\softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*driver.get("http://rediff.com");
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("anil");
		driver.findElement(By.cssSelector("input#password")).sendKeys("goodbye");
		driver.findElement(By.xpath("//input[contains(@type,'sub')]")).click();*/
		driver.get("http://www.google.com");
		driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).sendKeys("Youtube");
		driver.findElement(By.xpath("//div[@class='gb_8d gb_h gb_mg gb_dg']/div[2]/a")).click();
	}

}
