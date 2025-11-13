package Generic_Utility;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {
	public WebDriver driver;
	static WebDriver sdriver;
	
	
@BeforeSuite
public void BS() {
	System.out.println("Connecting to the server");
}
@BeforeTest
public void BT() {
	System.out.println("execute script in parallel mode");
	
}
@BeforeClass
public void BC() {
	System.out.println("Launching the browser");
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
 @BeforeMethod
 public void BM() {
	 System.out.println("Login to the Vtiger");
	 driver.get("http://localhost:8888/index.php?action=index&module=Home");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement username = driver.findElement(By.name("user_name"));
		WebElement pwd = driver.findElement(By.name("user_password"));
		wait.until(ExpectedConditions.visibilityOf(username)).sendKeys("admin");
		wait.until(ExpectedConditions.visibilityOf(pwd)).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys(Keys.ENTER);
 }











}
