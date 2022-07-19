package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://login.salesforce.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		/*driver.findElement(By.id("username")).sendKeys("AnilPavuluru13");
		driver.findElement(By.name("pw")).sendKeys("4351329");
		//driver.findElement(By.className("button r4 wide primary")).click();
		//driver.findElement(By.id("forgot_password_link")).click();
		driver.findElement(By.xpath("//button[@id='Login']")).click();
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());*/
		
	}

}
