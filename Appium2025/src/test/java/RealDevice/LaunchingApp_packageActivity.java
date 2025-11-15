package RealDevice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

//already installed native app hai to use open krna hai with package and activity 
public class LaunchingApp_packageActivity {
public static void main(String[] args) throws MalformedURLException, InterruptedException {
	DesiredCapabilities cap = new DesiredCapabilities();
    cap.setCapability("deviceName", "Android");
    cap.setCapability("platformName", "Android");
    cap.setCapability("platformVersion", "14"); // Replace with actual version
    cap.setCapability("automationName", "UiAutomator2");
    cap.setCapability("appPackage", "com.hihonor.calculator");
    cap.setCapability("appActivity", "com.hihonor.calculator.Calculator");

    URL url = new URL("http://127.0.0.1:4723/");
    AndroidDriver driver = new AndroidDriver(url, cap);
    Thread.sleep(2000);
    
    
    driver.findElement(By.id("com.hihonor.calculator:id/digit_8")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("com.hihonor.calculator:id/op_add")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("com.hihonor.calculator:id/digit_8")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("com.hihonor.calculator:id/eq")).click();
    WebElement result = driver.findElement(By.id("com.hihonor.calculator:id/formula"));
    System.out.println(result.getText());
    
    
}
}
