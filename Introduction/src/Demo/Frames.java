package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "F:\\softwares\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        
       System.out.println(driver.findElements(By.tagName("iframe")).size());
        //driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
       driver.switchTo().frame(0);
        Actions a=new Actions(driver);
        WebElement source= driver.findElement(By.id("draggable"));
        WebElement target= driver.findElement(By.id("droppable"));
        a.dragAndDrop(source, target).build().perform();
driver.switchTo().defaultContent();
	}

}
