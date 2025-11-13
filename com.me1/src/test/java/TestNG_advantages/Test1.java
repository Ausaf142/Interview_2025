package TestNG_advantages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
@Test (groups = "ausaf")
public void test1() {
	System.out.println("test1 only");
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
}

@Test (groups = "smoke")
public void qspider() {
	System.out.println("Selenium");
}
@Test (groups = "ausaf")
public void pyspider() {
	System.out.println("Python");
}
@Test
public void jspider() {
	System.out.println("Java");
}


}
