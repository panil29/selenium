import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;
public class Locator {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement namedEditBox=driver.findElement(By.cssSelector("[name='name']"));
		System.out.println(driver.findElement(withTagName("label").above(namedEditBox)).getText());
	WebElement birth=driver.findElement(By.cssSelector("[for='dateofBirth']"));
	driver.findElement(withTagName("input").below(birth)).sendKeys("21/06/2021");
	WebElement identity=driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
	driver.findElement(withTagName("input").toLeftOf(identity)).click();
	WebElement radio=driver.findElement(By.id("inlineRadio1"));
	System.out.println(driver.findElement(withTagName("label").toRightOf(radio)).getText());
		
		

		
		
		
		
		
		
		
		
		
		
	}
}
