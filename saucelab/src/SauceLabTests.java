import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SauceLabTests {
	public static final String USERNAME = "oauth-anil.pavuluru0129-97625";
	  public static final String ACCESS_KEY = "eebfe01f-70d1-47e3-9292-327bdd72955e";
	  public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		MutableCapabilities sauceOptions = new MutableCapabilities();

		ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.setExperimentalOption("w3c", true);
		browserOptions.setCapability("platformName", "Windows 10");
		browserOptions.setCapability("browserVersion", "80.0");
		browserOptions.setCapability("sauce:options", sauceOptions);
	
		
WebDriver driver=new RemoteWebDriver(new URL(URL),browserOptions);
driver.get("http://google.com");
System.out.println(driver.getTitle());
driver.quit();
	}

}
