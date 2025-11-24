package RealDevice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class ScrolluptoSwitch_Handling {
public static void main(String[] args) throws MalformedURLException, InterruptedException {
	DesiredCapabilities cap = new DesiredCapabilities();
    cap.setCapability("deviceName", "Android");
    cap.setCapability("platformName", "Android");
    cap.setCapability("platformVersion", "14"); // Replace with actual version
    cap.setCapability("automationName", "UiAutomator2");
    cap.setCapability("appPackage", "io.appium.android.apis");
    cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");

    URL url = new URL("http://127.0.0.1:4723/");
    AndroidDriver driver = new AndroidDriver(url, cap);
    Thread.sleep(2000);
    System.out.println("App started");
    
//    ids are same so we will use findelements which will return list and then by get() we will target the element
    driver.findElements(By.id("android:id/text1")).get(11).click();
//    scroll to the element name in variable
    String element = "Switches";
    WebElement switchbtn = driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"+
    ".scrollIntoView(new UiSelector().text(\""+element+"\"))"));
    
//    inside the text if we want text wrap with qout then we use \" "+element+" \"

    //    click over the switches
    switchbtn.click();
    	
    	//click on the monitored switch
    	driver.findElement(By.id("io.appium.android.apis:id/monitored_switch")).click();
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
}
