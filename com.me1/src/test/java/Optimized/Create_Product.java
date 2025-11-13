package Optimized;

import org.testng.annotations.Test;
import org.testng.util.RetryAnalyzerCount;

import Generic_Utility.Base_Class;
import Generic_Utility.JavaUtility;
import Generic_Utility.Retryy;
import Object_Repository.HomePage;
import Object_Repository.Product_Addition;

public class Create_Product extends Base_Class {
	
	
@Test (retryAnalyzer=Retryy.class)
public void product() {
	JavaUtility jlib= new JavaUtility();
	int num = jlib.randomNo();
	HomePage hp = new HomePage(driver);
	hp.product();
	Product_Addition pa= new Product_Addition(driver);
	pa.productAddition("sufi"+num+"");
	

}
}
