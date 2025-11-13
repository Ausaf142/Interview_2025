package Revison_August2025;

import java.util.concurrent.TimeUnit;import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * ID
 * Name
 * CSS selector
 * tagName
 * ClassName
 * linkedtext
 * PartialLinkedtext
 * xpath-
 * 	attributes
 * 	Text
 * 	traversing
 * 	indexing
 * */
public class Locators {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.findElement(By.id("name")).sendKeys("Ausaf Ahmad");
	driver.findElement(By.id("male")).click();
	/*CSS-SELECTOR*/
	driver.findElement(By.cssSelector("input[placeholder='Enter EMail']")).sendKeys("asf123@gmal.com");
	WebElement item = driver.findElement(By.id("para2"));
	JavascriptExecutor js = (JavascriptExecutor)driver;
//	js.executeScript("window.scrollBy(0,1000)");
	js.executeScript("arguments[0].scrollIntoView(true)",item);
	Thread.sleep(4000);
//  tagName
//	driver.findElement(By.tagName("button")).click();
//	ClassName
	driver.findElement(By.className("start")).click();
//	linkText
//	driver.findElement(By.linkText("STOP")).click();
//	Xpath-Text
	driver.findElement(By.xpath("//button[text()='STOP']")).click();
//	Xpath-Attribute	
	driver.findElement(By.xpath("//button[@name='start']")).click();
//	Xpath by Index
	driver.findElement(By.xpath("(//button[text()='Submit'])[4]")).click();
//	Xpath-contains
	driver.findElement(By.xpath("//a[contains(text(),'Hidden')]")).click();
	System.out.println("Hareem Sheikh");

	driver.quit();
	
}
}
