package Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath = "//a[text()='More']")
	public WebElement more;
@FindBy(xpath = "//a[text()='Campaigns']")
public WebElement campaign;

@FindBy(xpath = "//a[text()='Products']")
public WebElement productIcon;
@FindBy(xpath = "//a[text()='Organizations']")
public WebElement organisationIcon;
@FindBy(xpath = "//a[text()='Leads']")
public WebElement leadsIcon;

public void product() {
	productIcon.click();
}
public void Lead() {
	leadsIcon.click();
}
public void Organisation() {
	organisationIcon.click();
}
public void Campaigns() {
	more.click();
	campaign.click();
}












}
