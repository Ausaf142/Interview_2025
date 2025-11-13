package Generic_Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebDriver_Utility {
	
public void maximize(WebDriver driver) {
	driver.manage().window().maximize();
}
public void implicitWait(WebDriver driver) {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

public void action(WebDriver driver,WebElement ele1) {
	Actions act = new Actions(driver);
	act.click(ele1).perform();
	
}

public String ddt_Note(String data) throws IOException {
	FileInputStream fis = new FileInputStream("./Demo.properties");
	Properties p = new Properties();
	p.load(fis);
	String Data = p.getProperty(data);
	return Data;

}


}
