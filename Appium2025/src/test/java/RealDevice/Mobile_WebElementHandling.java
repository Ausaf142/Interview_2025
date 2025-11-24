package RealDevice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Mobile_WebElementHandling {
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
//    ids are same so we will use findelements which will return list and then by get() we will target the element
    driver.findElements(By.id("android:id/text1")).get(11).click();
//    click on control btn
    driver.findElements(By.id("android:id/text1")).get(4).click();
//    click o theme light
    driver.findElements(By.id("android:id/text1")).get(0).click();
//    enter text in textbox
    driver.findElement(By.id("io.appium.android.apis:id/edit")).sendKeys("ausaf");
//    click check box1
    driver.findElement(By.id("io.appium.android.apis:id/check1")).click();
//    click radio btn
    driver.findElement(By.id("io.appium.android.apis:id/radio2")).click();
    
    Thread.sleep(2000);
    driver.quit();
    
    
    
}
}
