
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		//switching window
		driver.switchTo().newWindow(WindowType.WINDOW);
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		String parentWindowId=it.next();
		String childWindowId=it.next();
		driver.switchTo().window(childWindowId);
		driver.get("https://rahulshettyacademy.com/#/index");
		String name=driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
		driver.switchTo().window(parentWindowId);
		WebElement names=driver.findElement(By.cssSelector("[name='name']"));
		names.sendKeys(name);
		//screenshot
		File file=names.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File("2.png"));
//driver.quit();
		//Get height and width
		System.out.println(names.getRect().getDimension().getHeight());
        System.out.println(names.getRect().getDimension().getWidth());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}