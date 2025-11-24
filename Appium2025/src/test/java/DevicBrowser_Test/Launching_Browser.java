package DevicBrowser_Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.functions.ExpectedCondition;

public class Launching_Browser {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities dcap =new DesiredCapabilities();
		
		    dcap.setCapability("platformName", "Android");
		    dcap.setCapability("platformVersion", "14"); // Replace with actual version
		    dcap.setCapability("automationName", "UiAutomator2");
		    dcap.setCapability("browserName", "Chrome");
		    dcap.setCapability("chromedriverExecutable", "C:\\Users\\dell\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
	
		    URL url = new URL("http://127.0.0.1:4723/");
		    AndroidDriver driver = new AndroidDriver(url, dcap);
		    Thread.sleep(2000);
		    driver.get("https://facebook.com");
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    driver.findElement(By.xpath("(//span[text()='मोबाइल नंबर या ईमेल'])[1]")).click();
		    driver.findElement(By.xpath("//span[text()='मोबाइल नंबर या ईमेल']")).sendKeys("dddd");
//		    WebElement mobile = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='मोबाइल नंबर या ईमेल']")));
//		    mobile.sendKeys("asd");
	
	
	}

}
