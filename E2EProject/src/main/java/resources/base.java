package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class base {

	public  WebDriver driver;
	public Properties prop;
public WebDriver initializeDriver() throws IOException
{
	
 prop= new Properties();
 //System.getProperty("user.dir")
//FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");
 FileInputStream fis=new FileInputStream("E:\\Workspace\\E2EProject\\src\\main\\java\\resources\\data.properties");
prop.load(fis);
//mvn test -Dbrowser=Chrome

String browserName=prop.getProperty("browser");
//String browserName=prop.getProperty("browser");
System.out.println(browserName);

if(browserName.equals("chrome"))
{
	 System.setProperty("webdriver.chrome.driver", "F:\\softwares\\chromedriver.exe");
	/* ChromeOptions options=new ChromeOptions();
	 if(browserName.contains("headless"))
	 {    
		 options.addArguments("headless");
	 }
		 driver=new ChromeDriver(options);
		//execute in chrome driver*/
	 driver=new ChromeDriver();
	
}
else if (browserName.equals("firefox"))
{
	 System.setProperty("webdriver.gecko.driver","F:\\softwares\\geckodriver.exe");

	 driver= new FirefoxDriver();
	//firefox code
}
else if (browserName.equals("IE"))
{
	//System.setProperty("webdriver.gecko.driver", "F:\\softwares\\chromedriver.exe");

	 driver= new FirefoxDriver();
//	IE code
}

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
return driver;


}


public String getScreenShotPath(String testCaseName,WebDriver driver) throws IOException
{
	TakesScreenshot ts=(TakesScreenshot) driver;
	File source =ts.getScreenshotAs(OutputType.FILE);
	String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
	FileUtils.copyFile(source,new File(destinationFile));
	return destinationFile;


}

}
