package customListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenersForTest implements ITestListener{

	public void onTestStart(ITestResult result) {
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Passed test:" + result.getName());
	}

	public void onTestFailure(ITestResult result) {
		//Reporter.log("screenshot links");
		
		//for reportng reports
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		
		//for default testng reports
		Reporter.log("<a href= \"C:\\Users\\apoorv\\OneDrive\\Pictures\\Screenshots\\sel.png\">Screenshot link</>");
	}

	public void onTestSkipped(ITestResult result) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		
	}
}
