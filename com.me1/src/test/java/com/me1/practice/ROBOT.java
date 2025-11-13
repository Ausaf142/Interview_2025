package com.me1.practice;

import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ROBOT {
@Test
public void rbt() throws IOException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://testautomationpractice.blogspot.com/");
	
//	driver.findElement(By.xpath("//form[@id='singleFileForm']//input[@type='file']")).click();
	//done manually bcz it is not clicking over the upload file button
	Runtime.getRuntime().exec("./autoit.exe");

}
}
