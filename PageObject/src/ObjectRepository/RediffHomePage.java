package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomePage {

	WebDriver driver;
	public RediffHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

@FindBy(id="srchword")
WebElement search;

@FindBy(xpath="//input[@type='submit']")
WebElement scope;
	public WebElement Search()
	{
	   return search;
	}
	public WebElement Scope()
	{
	    return scope;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

