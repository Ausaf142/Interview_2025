package RealDevice;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Array;
import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.PointerInput.Kind;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;

public class DragDrop {
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
    
//  Id's are same so we will use findElements which will return list and then by get() we will target the element.
//  Click on views
    driver.findElements(By.id("android:id/text1")).get(11).click();
    
//  Click on drag&drop
    driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Drag and Drop\"]")).click();
    
    WebElement source = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
    WebElement destination = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_2"));
    Point sourceCentre = centre(source);
    Point DestinationCentre = centre(destination);
    
    PointerInput finger1= new PointerInput(PointerInput.Kind.TOUCH, "finger1");
    
    Sequence seq=new Sequence(finger1, 1)
    		.addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), sourceCentre))
    		.addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
    		.addAction(new Pause(finger1,Duration.ofMillis(588)))
    		.addAction(finger1.createPointerMove(Duration.ofMillis(500), PointerInput.Origin.viewport(), DestinationCentre))
    		.addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
    driver.perform(Arrays.asList(seq));
    Thread.sleep(2000);
  
    
} 
public static Point centre(WebElement element) {
	Point loc = element.getLocation();
	Dimension size = element.getSize();
	Point p=new Point(loc.x+size.width/2,loc.y+size.height/2);
	return p;
	
}

}
