package TestNG_advantages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {
	WebDriver driver;
	
	
	@Parameters("browser")
	@Test
	public void setup(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
		}
		
	}
	
	
	
@Test
public void test2() {
	System.out.println("test2 only");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://localhost:8888/index.php?action=index&module=Home");
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	WebElement username = driver.findElement(By.name("user_name"));
	WebElement pwd = driver.findElement(By.name("user_password"));
	wait.until(ExpectedConditions.visibilityOf(username)).sendKeys("admin");
	wait.until(ExpectedConditions.visibilityOf(pwd)).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys(Keys.ENTER);
	
}
}
