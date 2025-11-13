package Optimized;

import org.testng.annotations.Test;

import Generic_Utility.Base_Class;
import Object_Repository.Campaign_creations;
import Object_Repository.HomePage;

public class Campaigns_Additions extends Base_Class{
@Test
public void campaignsAdditions(){
	HomePage hp =new HomePage(driver);
	hp.Campaigns();
	Campaign_creations cp = new Campaign_creations(driver);
	cp.Campaigns_Additions("sufijaan",driver);
	
}
}
