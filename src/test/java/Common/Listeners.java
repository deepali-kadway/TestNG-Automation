package Common;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import Utilities.testUtility;

public class Listeners extends testUtility implements ITestListener{

	public void onTestStart(ITestResult results)
	{
		System.setProperty("org.uncommons.reportng.title", "Automation Testing Suite");
		Reporter.log("Method name is: "+results.getName());
		System.out.println("Test case starting");
	}
	
	public void onTestSuccess(ITestResult results)
	{
		Reporter.log("Status of the Execution is: "+results.getStatus());
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log("<a href=\"C:\\Users\\Deepali\\eclipse-workspace\\MavenTestNG\\screenshot\">Test Results</a>");
	}
	
	public void onTestFailure(ITestResult results)
	{
		Reporter.log("Status of the Execution is: "+results.getStatus());
		System.out.println("Capturing SS for failed Test:");
		try {
			getScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log("<a href=\"C:\\Users\\Deepali\\eclipse-workspace\\MavenTestNG\\screenshot\">Test Results</a>");
	}
	
	public void onTestSkipped(ITestResult results)
	{
		//TODO auto generated method STUB
	}
	
	public void onTestFailedButWithSuccessPercentage(ITestResult results)
	{
		//TODO auto generated method STUB
	}
	
	public void onStart(ITestContext context)
	{
		//TODO auto generated method STUB
	}
	
	public void onFinish(ITestContext context)
	{
		//TODO auto generated method STUB
	}
	
}
