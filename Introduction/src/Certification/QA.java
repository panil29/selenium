package Certification;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class QA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Desired capabilities
		//general chrome profiles
		DesiredCapabilities ch=DesiredCapabilities.chrome();
		//ch.acceptInsecureCerts();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		//belows to your local browser
		ChromeOptions c=new ChromeOptions();
		c.merge(ch);
		System.setProperty("webdriver.chrome.driver", "F:\\softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(c);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
