package screenShot;

import org.testng.ITestListener;
import org.testng.*;

public class CustomListener extends BaseClass implements ITestListener{
	
	@Override
	public void onTestStart(ITestResult result) {
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test Failed");
		failed();
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		
	}
	
}
