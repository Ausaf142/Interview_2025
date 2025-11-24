package RealDevice;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class LongPress {
	static {
		System.out.println("Dialing my number");
	}
public static void main(String[] args) throws MalformedURLException, InterruptedException {
	DesiredCapabilities cap = new DesiredCapabilities();
    cap.setCapability("deviceName", "Android");
    cap.setCapability("platformName", "Android");
    cap.setCapability("platformVersion", "14"); // Replace with actual version
    cap.setCapability("automationName", "UiAutomator2");
    cap.setCapability("appPackage", "com.hihonor.contacts");
    cap.setCapability("appActivity", "com.android.contacts.activities.DialtactsActivity");

    URL url = new URL("http://127.0.0.1:4723/");
    AndroidDriver driver = new AndroidDriver(url, cap);
    Thread.sleep(2000);
    
//    click on phone icon
    driver.findElement(By.id("com.hihonor.contacts:id/top_icon")).click();
    
//    now enter numbers
    driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.hihonor.contacts:id/contacts_dialpad_key_number\" and @text=\"9\"]")).click();
    driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.hihonor.contacts:id/contacts_dialpad_key_number\" and @text=\"7\"]")).click();
    driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.hihonor.contacts:id/contacts_dialpad_key_number\" and @text=\"0\"]")).click();
    driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.hihonor.contacts:id/contacts_dialpad_key_number\" and @text=\"8\"]")).click();
    driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.hihonor.contacts:id/contacts_dialpad_key_number\" and @text=\"3\"]")).click();
    driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.hihonor.contacts:id/contacts_dialpad_key_number\" and @text=\"7\"]")).click();
    driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.hihonor.contacts:id/contacts_dialpad_key_number\" and @text=\"1\"]")).click();
    driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.hihonor.contacts:id/contacts_dialpad_key_number\" and @text=\"3\"]")).click();
    driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.hihonor.contacts:id/contacts_dialpad_key_number\" and @text=\"8\"]")).click();
    driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.hihonor.contacts:id/contacts_dialpad_key_number\" and @text=\"6\"]")).click();
    
    //click once backspace
    WebElement backSpacebtn = driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.hihonor.contacts:id/menu_item_image\"])[2]"));
    backSpacebtn.click();
    
//    for long press create on mtd separte
    longClick(backSpacebtn, driver);
    Thread.sleep(2000);
    System.out.println();
}   
    
 public static void longClick(WebElement e,AndroidDriver driver) {
	 Point loc = e.getLocation();
	 PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH,"abc");
	 Sequence c = new Sequence(finger1, 1)
			 .addAction(finger1.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), loc))
			 .addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
			 .addAction(new Pause(finger1, Duration.ofMillis(1000)))
			 .addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
	 driver.perform(Arrays.asList(c));
			 
	 
 }
    
    
    
    
    
    
    
    
    
    

}
