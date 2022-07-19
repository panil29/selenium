package test;
import org.testng.ITestListener;
import org.testng.ITestResult;
//ITestListener interface which implements Testng Listeners
public class Listeners implements ITestListener {
@Override
public void onTestSuccess(ITestResult result)
{
	System.out.println("i successfully executed listeners passed code");
}
@Override
public void onTestFailure(ITestResult result)
{
	System.out.println("i failed executed listeners passed code"+result.getName());
}

}
