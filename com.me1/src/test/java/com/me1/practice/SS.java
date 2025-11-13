package com.me1.practice;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class SS {
public static void main(String[] args) throws IOException {
	String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());


	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://facebook.com/login");
	File file = new File("./SS/ss1"+timestamp+".png");
	TakesScreenshot ts =(TakesScreenshot)driver;
	File ss1 = ts.getScreenshotAs(OutputType.FILE);
	Files.copy(ss1,file);
	File file2 = new File("./SS/ss2"+timestamp+".png");
	WebElement ele = driver.findElement(By.id("email"));
	File ss2 = ele.getScreenshotAs(OutputType.FILE);
	Files.copy(ss2,file2);
	
	
}
}
