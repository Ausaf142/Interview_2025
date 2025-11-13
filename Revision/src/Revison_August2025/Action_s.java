package Revison_August2025;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_s {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://testautomationpractice.blogspot.com/");
		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//button[text()='Point Me']"));
		act.moveToElement(ele).perform();
		WebElement ele2=driver.findElement(By.xpath("//button[text()='Copy Text']"));
		act.doubleClick(ele2).perform();
		
		WebElement source= driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement target= driver.findElement(By.xpath("//p[text()='Drop here']"));
		act.dragAndDrop(source, target).perform();
		WebElement ele6 = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default' and @style='left: 60%;']"));
		act.clickAndHold(ele6).moveByOffset(30, 0).release().perform();	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100)", true);
		act.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).perform();
		
		
	}

}