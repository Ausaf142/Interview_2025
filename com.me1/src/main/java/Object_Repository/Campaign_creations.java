package Object_Repository;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Campaign_creations {
	public Campaign_creations(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//img[@alt='Create Campaign...']")
	public WebElement plusBtn;
	@FindBy(xpath="//input[@name='campaignname']")
	public WebElement campaignName;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement savebtn;
	public WebElement getSavebtn() {
		return savebtn;
	}

public void Campaigns_Additions(String name,WebDriver driver) {
	WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	w.until(ExpectedConditions.elementToBeClickable(plusBtn));
	plusBtn.click();
	campaignName.sendKeys(name);
	savebtn.click();
	
}


}



