package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
	public static void main(String[] args) 
	{
	//create driver object for chrome browser
	// we will strictly implement methods of webdriver
	// class name chrome driver
	//invoke .exe file first
	System.setProperty("webdriver.chrome.driver", "F:\\softwares\\chromedriver.exe");
	WebDriver cd=new ChromeDriver();
	cd.get("https://google.com");//hit url on the browser
	System.out.println(cd.getTitle());//validate if your page title is correct
	System.out.println(cd.getCurrentUrl());//validate if you are landed on current url
	//System.out.println(cd.getPageSource());//print page source
	cd.get("https://yahoo.com");
	System.out.println(cd.getTitle());
	System.out.println(cd.getCurrentUrl());
	//System.out.println(cd.getPageSource());
	cd.navigate().back();// when we first hit google and second yahoo then it will come back to chrome
	cd.navigate().forward();
	cd.close();// it closes the current browser
    cd.quit();//it closes all the browsers opened by selenium script	
	}
}