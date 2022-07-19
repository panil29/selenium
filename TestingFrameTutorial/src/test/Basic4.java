package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Basic4 {
	@Parameters({"URL"})
@Test
public void webloginHomeLoan(String uname)
{
	//selenium 
		System.out.println("webloginhomePersonalloan");

	System.out.println(uname);
}
@Test(groups={"smoke"})
public void MobileLoginHomeLoan()
{
	//appium
	System.out.println("mobileloginhome");
}
@Test
public void LoginApiHomeLogin()
{
	//rest API automation
	System.out.println("Apiloginhome");
}
}
