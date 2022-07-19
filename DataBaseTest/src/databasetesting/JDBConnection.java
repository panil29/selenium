package databasetesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class JDBConnection {
public static void main(String[] args) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException
{

	//String dbClass="com.mysql.jdbc.Driver";
	String host="localhost";
   // Class.forName("com.mysql.jdbc.Driver");
	
	System.out.println("Driver jdbc loaded!");
	Connection con=DriverManager.getConnection("jdbc:mysql://"+host+":"+3306+"/Qadbt?autoReconnect=true&useSSL=false","root","Ravi@1976");
	
	Statement s=con.createStatement();
	
	ResultSet rs=s.executeQuery("select * from Employeeinfo where name='ravi'");
	while(rs.next())
	{
		System.setProperty("webdriver.chrome.driver", "F:\\softwares\\chromedriver.exe");
		WebDriver cd=new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://login.salesforce.com");
		
		cd.findElement(By.id("username")).sendKeys(rs.getString("username"));
		cd.findElement(By.id("password")).sendKeys(rs.getString("password"));
	System.out.println(rs.getString("age"));
	}

	
	
	
	
	
	
	
	
	
}
}
