package Revison_August2025;
import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Enter;

public class Robot_s {
	public static void main(String[] args) throws AWTException, InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://testautomationpractice.blogspot.com/");
	
	Robot rb = new Robot();
	rb.mouseWheel(15);
	
	Thread.sleep(6000);
//	driver.findElement(By.xpath("//button[text()='Upload Single File']/../input[@id='singleFileInput']")).click();
	Thread.sleep(2000);
	//done manually bcz it is not clicking over the upload file button
	rb.keyPress(KeyEvent.VK_D);
	rb.keyRelease(KeyEvent.VK_D);
	rb.keyPress(KeyEvent.VK_O);
	rb.keyRelease(KeyEvent.VK_O);
	rb.keyPress(KeyEvent.VK_W);
	rb.keyRelease(KeyEvent.VK_W);
	rb.keyPress(KeyEvent.VK_N);
	rb.keyRelease(KeyEvent.VK_N);
	Thread.sleep(2000);
	rb.keyPress(KeyEvent.VK_DOWN);
	rb.keyRelease(KeyEvent.VK_DOWN);
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	
	rb.keyPress(KeyEvent.VK_S);
	rb.keyRelease(KeyEvent.VK_S);
	rb.keyPress(KeyEvent.VK_E);
	rb.keyRelease(KeyEvent.VK_E);
	Thread.sleep(2000);
	rb.keyPress(KeyEvent.VK_DOWN);
	rb.keyRelease(KeyEvent.VK_DOWN);
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);
	
	
	
	

}
}