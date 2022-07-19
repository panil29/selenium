import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopUP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\softwares\\chromedriver.exe");
		WebDriver cd=new ChromeDriver();
		cd.manage().window().maximize();
		//cd.get("https://the-internet.herokuapp.com/");
		cd.get("@http://admin:admin@the-internet.herokuapp.com/");
		cd.findElement(By.linkText("Basic Auth")).click();
		
		
	}

}
