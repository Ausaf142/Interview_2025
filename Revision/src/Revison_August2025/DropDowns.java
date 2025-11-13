package Revison_August2025;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://testautomationpractice.blogspot.com/");
	WebElement ddown = driver.findElement(By.id("country"));
	Select s = new Select(ddown);
//	s.selectByIndex(1);
//	s.selectByValue("usa");
	s.selectByVisibleText("France");
	s.deselectByVisibleText("France");
}
}
