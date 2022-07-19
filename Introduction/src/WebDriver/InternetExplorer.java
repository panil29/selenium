package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorer {
	public static void main(String[] args) 
	{
	//create driver object for internetexplorer browser
	// we will strictly implement methods of webdriver
	// class name internet explorer driver
	//invoke .exe file first
	System.setProperty("webdriver.ie.driver", "F:\\softwares\\IEDriverServer.exe");
	WebDriver cd=new InternetExplorerDriver();
	cd.get("https://google.com");
	System.out.println(cd.getTitle());
	}

}
