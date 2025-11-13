package com.me1.practice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class switchToWindow_SwitchFrame {
public static void main(String[] args) throws InterruptedException {
//	WebDriverManager.firefoxdriver().setup();
//	WebDriver drive2 = new FirefoxDriver();
	WebDriverManager.chromedriver().setup();//it prepare driver for chrome
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://testautomationpractice.blogspot.com/");
	String id = driver.getWindowHandle();
	driver.findElement(By.id("PopUp")).click();
	Set<String> ids = driver.getWindowHandles();
	System.out.println(ids);
	for(String IDS:ids) {
		driver.switchTo().window(IDS);
		String title = driver.getTitle();
		System.out.println(title);
		if(!IDS.equalsIgnoreCase(id)&& title.equalsIgnoreCase("Selenium")) {
			
			driver.findElement(By.xpath("/html/body/header/nav/button/span")).click();
		}
	
	}
	Thread.sleep(3000);
	driver.switchTo().window(id);
	driver.findElement(By.id("name")).sendKeys("sqds");
	
	
	
	
}

}
