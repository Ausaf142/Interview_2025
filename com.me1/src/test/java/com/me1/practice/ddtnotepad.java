package com.me1.practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



import Generic_Utility.WebDriver_Utility;

public class ddtnotepad {
	@Test
public void ddtnote() throws IOException {
		WebDriver_Utility wu =new WebDriver_Utility();
		String URL = wu.ddt_Note("url");
		String UN = wu.ddt_Note("username");
		String PW = wu.ddt_Note("pwd");
//	FileInputStream fis = new FileInputStream("./Demo.properties");
//	Properties p = new Properties();
//	p.load(fis);
//	String URL = p.getProperty("url");
//	String un = p.getProperty("username");
//	String pwd = p.getProperty("pwd");

	
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(URL);
	WebElement email = driver.findElement(By.id("email"));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement command1 = wait.until(ExpectedConditions.elementToBeClickable(email));

	command1.sendKeys("ausaf142@gmail.com");

	command1.sendKeys(UN);

	
	driver.close();
	
}
}
