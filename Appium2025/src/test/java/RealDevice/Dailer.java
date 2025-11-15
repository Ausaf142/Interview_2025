package RealDevice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Dailer {
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
		    
		    //click on dailicon below
		    driver.findElement(By.id("com.hihonor.contacts:id/top_icon")).click();
		    driver.findElement(By.id("com.hihonor.contacts:id/contacts_dialpad_key_number")).click();
		    driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.hihonor.contacts:id/contacts_dialpad_key_number\" and @text=\"2\"]")).click();
		    
}
}
