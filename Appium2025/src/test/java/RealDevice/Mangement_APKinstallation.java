package RealDevice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Mangement_APKinstallation {
	 static {
	    	System.out.println("App installation Mangement");
	    }
public static void main(String[] args) throws MalformedURLException, InterruptedException {

	DesiredCapabilities cap = new DesiredCapabilities();
    cap.setCapability("deviceName", "HONOR GFY-LX2");
    cap.setCapability("platformName", "Android");
    cap.setCapability("platformVersion", "14"); // Replace with actual version
    cap.setCapability("automationName", "UiAutomator2");
//    cap.setCapability("appPackage", "com.hihonor.contacts");
//    cap.setCapability("appActivity", "com.android.contacts.activities.DialtactsActivity");

    URL url = new URL("http://127.0.0.1:4723/");
    AndroidDriver driver = new AndroidDriver(url, cap);
    Thread.sleep(2000);
//    here we will verify the apk parameters we need only path
    String appPackage = "io.appium.android.apis";
    String apkPath="C:\\Users\\dell\\Downloads\\ApiDemos-debug.apk";
    
//for installing through path   
//    driver.installApp(apkPath);
    
    driver.removeApp(appPackage);
   
//Condition for checking the app installation or not
    if(!driver.isAppInstalled(appPackage)) {
    	System.out.println("App is getting install! please wait");
    	driver.installApp(apkPath);
    }
    else {
    	System.out.println("App already found! No need to install");
    }
    
//after installing to launch we do activate
    System.out.println("App Launching");
    driver.activateApp(appPackage);
    
    Thread.sleep(2000);
    driver.terminateApp(appPackage);
    
    
}
}
