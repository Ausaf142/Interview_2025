package RealDevice;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;



public class InstallAPK {
@Test
public void demo() throws MalformedURLException, InterruptedException {
    DesiredCapabilities cap = new DesiredCapabilities();
    cap.setCapability("deviceName", "Android");
    cap.setCapability("platformName", "Android");
    cap.setCapability("platformVersion", "14"); // Replace with actual version
    cap.setCapability("automationName", "UiAutomator2");
    cap.setCapability("app", "C:/Users/dell/Downloads/ApiDemos-debug.apk");

    URL url = new URL("http://127.0.0.1:4723/");
    AndroidDriver driver = new AndroidDriver(url, cap);
    Thread.sleep(2000);
}
}