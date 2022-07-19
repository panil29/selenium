package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Basic1 {
	@AfterTest
	public void LastExecution()
	{
		System.out.println("Last execution");
	}
	
	@Test
	public void Demo()
	{
		System.out.println("Anil Pavuluru");//automation
		Assert.assertTrue(false);

	}
	@AfterSuite
	public void afSuite()
	{
		System.out.println("i am last every time");
	}
@Test
public void SecondTest()
{
	System.out.println("hello");
}
}
