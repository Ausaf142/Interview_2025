package Revison_August2025;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*here i am using all 11 mtds of webdriver and 2 search context
 * get
 * getcurrentURL
 * gettitle
 * getwindowhandle
 * getwindowhandles
 * navigate
 * manage
 * close
 * quit
 * getPageSource
 * switchto
 * 
 * */
public class WebDrivers_Metd {
public static void main(String[] args) throws InterruptedException  {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://facebook.com");
	String url = driver.getCurrentUrl();
	String title = driver.getTitle();
	System.out.println(url);
	System.out.println(title);
	System.out.println(driver.getWindowHandle());
	System.out.println(driver.getPageSource());
	driver.navigate().to("https://instagram.com");
	String url1 = driver.getCurrentUrl();
	String title1 = driver.getTitle();
	System.out.println(url1);
	System.out.println(title1);
	System.out.println(driver.getWindowHandles());
	driver.navigate().back();
	Thread.sleep(4000);
	driver.close();

	
	
}
}
