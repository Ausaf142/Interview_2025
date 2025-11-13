package Revison_August2025;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstDummy {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://google.com");
	driver.findElement(By.name("q")).sendKeys("srk");
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	

}
}
