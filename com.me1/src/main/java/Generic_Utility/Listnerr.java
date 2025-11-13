package Generic_Utility;

import org.testng.ITestListener;
import org.testng.ITestResult;


public class Listnerr implements ITestListener {
public void onTestSuccess(ITestResult result) {
	String methodName = result.getMethod().getMethodName();
	System.out.println(methodName);
	
	
}
}

