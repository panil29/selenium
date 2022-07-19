package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {
	public static void main(String[] args)
	{
		//create driver object for firefox browser
		// we will strictly implement methods of webdriver
		// class name firefox driver
		//invoke .exe file first
		System.setProperty("webdriver.gecko.driver", "F:\\softwares\\geckodriver.exe");
		WebDriver cd=new FirefoxDriver();
		cd.get("https://google.com");
		System.out.println(cd.getTitle());
		}

}
