package Certification;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;



public class BrokenLinks {
public static void main(String[] args) throws IOException {
	

	System.setProperty("webdriver.chrome.driver", "F:\\softwares\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.rahulshettyacademy.com/AutomationPractice");
	
	//broken link
	//step-1 is to get all urls tied up to the links using selenium
	//java methods calls url's and get's you status code
	//if status code >400 then that url is not working -> link the teid url is broken
	
	List<WebElement>links=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
	SoftAssert a=new SoftAssert();
	for(WebElement link:links)
	{
	String url=	link.getAttribute("href");
HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
conn.setRequestMethod("HEAD");
conn.connect();
int respCode=conn.getResponseCode();
System.out.println("Response:\t"+respCode);
a.assertTrue(respCode<400,"The link with text\t"+link.getText()+"\tis broken with code"+respCode);

	}
//String url=driver.findElement(By.cssSelector(("a[href*='soapui']"))).getAttribute("href");

a.assertAll();










}
}
