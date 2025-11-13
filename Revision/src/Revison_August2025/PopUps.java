package Revison_August2025;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUps {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.findElement(By.id("alertBtn")).click();
	driver.switchTo().alert().accept();
	Thread.sleep(3000);
	driver.findElement(By.id("confirmBtn")).click();
	driver.switchTo().alert().accept();
	Thread.sleep(3000);
	driver.findElement(By.id("promptBtn")).click();
	driver.switchTo().alert().sendKeys("kk");
	Thread.sleep(3000);
	driver.switchTo().alert().dismiss();
	Thread.sleep(3000);
	driver.close();
	
	
	
}
}
