package Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_Addition {
	public Product_Addition(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//img[@alt='Create Product...']")
	public WebElement plusBtn;
	@FindBy(xpath="//input[@name='productname']")
	public WebElement productName;
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement savebtn;
	
	
	
	public WebElement getSavebtn() {
		return savebtn;
	}



	public void productAddition(String prodName) {
		plusBtn.click();
		productName.sendKeys(prodName);
		savebtn.click();
		
	}
	
	

}
