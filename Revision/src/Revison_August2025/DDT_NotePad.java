package Revison_August2025;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDT_NotePad {

public static void main(String[] args) throws IOException {
	FileInputStream fis = new FileInputStream("./Demo.properties");
	Properties p = new Properties();
	p.load(fis);
	String URL = p.getProperty("url");
	String UN = p.getProperty("username");
	String PWD=p.getProperty("pwd");
	
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(URL);
	driver.findElement(By.id("email")).sendKeys(UN);
	driver.findElement(By.id("pass")).sendKeys(PWD);
	driver.findElement(By.id("pass")).sendKeys(Keys.ENTER);
	
	

}
}



