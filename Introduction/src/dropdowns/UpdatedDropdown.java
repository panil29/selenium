package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//TestNG is  a frame work
public class UpdatedDropdown {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	    Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	    //Assert.assertFalse(false);
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		//count the number of check boxes
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		driver.findElement(By.id("divpaxinfo")).click();
	    Thread.sleep(2000L);
	     /*int i=1;
	       while(i<5)
	       {
	          driver.findElement(By.id("hrefIncAdt")).click();
	          i++
	       }
	      */
	     System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	     for(int p=1;p<5;p++)
	     {
	    	 driver.findElement(By.id("hrefIncAdt")).click();
	     }
	     driver.findElement(By.id("btnclosepaxoption")).click();
	     Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
	     System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}
}
