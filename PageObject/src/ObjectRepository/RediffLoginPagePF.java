package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPagePF {

	WebDriver driver;
	public RediffLoginPagePF(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	
	@FindBy(xpath="//input[@id='login1']")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(name="proceed")
	WebElement signin;
	
	
	@FindBy(linkText="rediff.com")
	WebElement home;
	

public WebElement EmailId()
{
	 return username;
}


public WebElement Word() {
	
	return Word();
}
public WebElement Submit()
{
   return signin;
}
public WebElement Home()
{
	return home;
}
}

