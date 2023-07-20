package testNGtestscripts;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retrytest {
	
	public class RetryTest implements IRetryAnalyzer{

	private int retryCount = 0;
	private static final int maxetryCount = 3;
	
	@Override

	public boolean retry(ITestResult result) {
	if(!result.isSuccess ()) {
	if (retryCount < maxetryCount) {
	retryCount++;
	return true;
	}
	}
	return false;
	

	}
	}
}
	


