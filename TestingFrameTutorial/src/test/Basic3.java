package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Basic3 {
@BeforeClass
public void Bondam()
{
	System.out.println("before ecxecuting any methods in the partciular class");
}
@Parameters({"URL","APIKEYS/USRNAME"})
@Test
public void weblogin(String urlname,String key)
{
	//selenium 
	System.out.println("weblogincar");
	System.out.println(urlname);
	System.out.println(key);
}
@AfterClass
public void MysorePak()
{
	System.out.println("Mysorepak");
}
@BeforeMethod
public void beforeevery()
{
	System.out.println("i will exceute before every test method in basic3 class");
}
@AfterMethod
public void After()
{
	System.out.println("i will excute after every method");
}
@Test(groups={"smoke"})
public void MobileLogincarLoan()
{
	//appium
	System.out.println("mobilelogincar");
}
@BeforeSuite
public void Bfsuite()
{
	System.out.println("i am first");
}
@Test(enabled=false)
public void MobileSignincarLoan()
{
	//appium
	System.out.println("mobilesignin");
}
@Test(dataProvider="getData")
public void MobileSignOutCarLoan(String username,String password)
{
	//appium
	System.out.println("mobilesignout");
	System.out.println(username);
	System.out.println(password);
}
@Test(dependsOnMethods= {"weblogin","MobileSignOutCarLoan"})
public void ApiCarLogin()
{
	//rest API automation
	System.out.println("Api login car");
}
@DataProvider
public Object[][] getData()
{
//1st combination-username password-good credit history
//2nd-usernamepassword- no credit history
//3rd-farudelent credit history
	Object[][] data=new Object[3][2];
	data[0][0]="firstusername";
	data[0][1]="password";
	//columns in the row are nothing but values for that particular combination(row)
	
	//2nd set
	data[1][0]="secondsetusername";
	data[1][1]="secondpassword";
	
	//3rd set;
	data[2][0]="thirdsetusername";
	data[2][1]="thirdpassword";
	return data;
	
}
}
