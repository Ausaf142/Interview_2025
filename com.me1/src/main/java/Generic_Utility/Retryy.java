package Generic_Utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class Retryy implements IRetryAnalyzer{
	
	int count=0;
	int limit=2;
	
	public boolean retry(ITestResult result) {
		if(count<limit) {
			return true;
		}
		return false;
		
		
	}

}
