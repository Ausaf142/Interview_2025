package Revison_August2025;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebElements_Handling {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		Dimension d =new Dimension(899,900);
		driver.manage().window().setSize(d);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.id("name")).sendKeys("Ausaf Ahmad");
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("Adeeb");
//		=======================================================================================
		driver.findElement(By.id("male")).click();
		System.out.println(driver.findElement(By.id("male")).getSize());
		System.out.println(driver.findElement(By.id("male")).getSize().getHeight());
		System.out.println(driver.findElement(By.id("male")).getSize().getWidth());
		System.out.println(driver.findElement(By.id("male")).getLocation());
		System.out.println(driver.findElement(By.id("alertBtn")).getText());
//		System.out.println(driver.findElement(By.xpath("//button[text()='STOP']")).isDisplayed());
		WebElement e = driver.findElement(By.id("btn1"));
		System.out.println(e.isDisplayed());
		System.out.println(e.isEnabled());
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
