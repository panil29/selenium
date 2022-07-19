import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class FileUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		String downloadPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "F:\\softwares\\chromedriver.exe");
		HashMap<String, Object> chromePrefs=new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_setting.popups",0);
		chromePrefs.put("download.default_directory",downloadPath);
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs",chromePrefs);
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://pdf2jpg.net/");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(3000);
	Runtime.getRuntime().exec("C:\\Users\\hp\\Documents\\check\\fileuploads.exe");
	WebDriverWait wait=new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("convert_pdf_to_jpg_button")));
	driver.findElement(By.id("convert_pdf_to_jpg_button")).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("download_zip_file_link")));
	driver.findElement(By.id("download_zip_file_link")).click();
	Thread.sleep(5000);
	File f=new File(downloadPath+"/summer-2021.zip");
	if(f.exists())
	{
		Assert.assertTrue(f.exists());
		System.out.println("file found");
		if(f.delete())
		{
			System.out.println("file deleted");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
