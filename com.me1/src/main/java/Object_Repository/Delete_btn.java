package Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Delete_btn {
	public Delete_btn(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
@FindBy(xpath = "//input[@title='Delete [Alt+D]']")
public WebElement delbtn;

public void delete_btn() {
	delbtn.click();
}
	
	
	
	
}
