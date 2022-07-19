package TestCases;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ObjectRepository.RediffHomePage;
import ObjectRepository.RediffLoginPage;

public class LoginApplication {
	
@Test
public void LogIn()
{
System.setProperty("webdriver.chrome.driver","F:\\softwares\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
RediffLoginPage rd=new RediffLoginPage(driver);
rd.EmailId().sendKeys("anil");
rd.Word().sendKeys("Pavuluru");
rd.Submit().click();
rd.Home().click();
RediffHomePage rh=new RediffHomePage(driver);
rh.Search().sendKeys("rediff");
rh.Scope().click();




}
}
